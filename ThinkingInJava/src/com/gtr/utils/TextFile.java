package com.gtr.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * 
 * 
 * @author GT-R
 * @date 2015年7月16日 下午8:17:23
 */
public class TextFile extends ArrayList<String> {
	private static final long serialVersionUID = 8687449794150677972L;

	//  read a file as a single string
	public static String read(String fileName) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new FileReader(
					new File(fileName).getAbsoluteFile()));
			try {
				String s = null;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	
	// write a single file in one method call
	public static void write(String fileName, String text) {
		try {
			PrintWriter out = new PrintWriter(
					new File(fileName).getAbsoluteFile());
			try {
				out.print(text);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new  RuntimeException(e);
		}
	}
	
	// read a file, split by any regular expression
	public TextFile(String fileName, String splitter) {
		super(Arrays.asList(read(fileName).split(splitter)));
		// regular expression split() ofen leaves an empty
		// String at the first position
		if (get(0).equals("")) {
			remove(0);
		}
	}
	
	// normally read by lines
	public TextFile(String fileName) {
		this(fileName, "\n");
	}
	
	public void write(String fileName) {
		try {
			PrintWriter out = new PrintWriter(
					new File(fileName).getAbsoluteFile());
			try {
				for (String item : this) {
					out.print(item);
				}
			} finally {
				out.close();
			}
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	// simple test
	public static void main(String[] args) {
		String file = read("TextFile.java");
		write("test.txt", file);
		TextFile text = new TextFile("test.txt");
		text.write("test.txt");
		// break into unique sorted list of words
		TreeSet<String> words = new TreeSet<String>(
				new TextFile("TextFile.java", "\\W+"));
		// display the capitalized words
		System.out.println(words.headSet("a"));
	}
}
