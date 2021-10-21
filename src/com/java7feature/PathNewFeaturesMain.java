package com.java7feature;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathNewFeaturesMain {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/resources/dataFile.txt");
		byte[] fileData = Files.readAllBytes(path);
		String fileContent = new String(fileData, StandardCharsets.UTF_8);
		System.out.println(fileContent);
		Files.write(path, "\nNew Data Added".getBytes(), StandardOpenOption.APPEND);
		/*
		 * Path fileName = path.getFileName();
		 * System.out.println(fileName.toString());
		 * System.out.println(path.getFileSystem().toString()); for (int i = 0;
		 * i < path.getNameCount(); i++) {
		 * System.out.print("/"+path.getName(i)); }
		 * System.out.println(path.getRoot());
		 * System.out.println(path.getParent());
		 */
	}
}
