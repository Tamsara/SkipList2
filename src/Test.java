/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ying
 */
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
     public static void main(String[] args)
   {
       BufferedReader reader;
       String str="",str2="",s1="";
       int n = 0;
       int t=0,end=0;
      Scanner scan = new Scanner(System.in);
      SkipList S = new SkipList();
		try {
			reader = new BufferedReader(new FileReader(
					"/Users/Ying/Documents/NetBeansProjects/SkipList2/src/dic2.txt"));
			String line = reader.readLine();
                        System.out.println("------");
			while (line != null) {
				// read next line
				line = reader.readLine();
                                S.put(line+"",123);
			}
                        S.printHorizontal();
                        System.out.println("------");
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
              System.out.print("Enter word: ");
              str=scan.nextLine();
              String[] words = str.split("\\s+");
             for (int i = 0; i < words.length; i++) {
               words[i] = words[i].replaceAll("[^\\w]", "");
               System.out.println("Word : "+S.get(words[i]));
              }
   } 
}
