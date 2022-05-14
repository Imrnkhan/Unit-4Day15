package Unit4Day15.Question2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Imran khan");
		bw.flush();
		bw.close();
		System.out.println("done");
		System.out.println("------------- Buffer Reader ---------------");

		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while(line != null){
			System.out.println(line);
			line=br.readLine();
			}
		br.close();

		System.out.println("------------- File Reader ---------------");
		FileReader fr1 = new FileReader("abc.txt");
		int i=fr1.read();

		while(i != -1) {
			System.out.println((char)i);
			i =fr1.read();
		}

		System.out.println("------------- File Reader using Java.io.nio ---------------");

		Path p = Paths.get("abc.txt");
		List<String> list = Files.readAllLines(p);
		for(String line1:list) {
			System.out.println(line1);
			}

	}
}



// Question2

// 1.Write a program to read the content from the abc.txt file using BufferedReader.

// 2.Write a program to read the content of the file abc.txt using FileReader.

// 3.Write a program to read the content of the file abc.txt using java.nio.file.Files class.