package com.java7feature;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceMain {
	public static void main(String[] args) throws IOException, InterruptedException {
		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path path = Paths.get("D:\\WatchService");
		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);
		boolean poll = true;
		WatchKey watchKey = watchService.take();
		while (poll) {
			for (WatchEvent<?> event : watchKey.pollEvents()) {
				System.out.println("Event Kind : " + event.kind() + " Event Context : " + event.context());
			}
			poll = watchKey.reset();
		}
	}
}
