package com.company;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int wordCount = 0;
        int lineCount = 0;
        int emptyLines = 0;
	    String line;
        BufferedReader in;

        in = new BufferedReader(new FileReader("text.txt"));
        line = in.readLine();

        while (line!= null)
        {
            //lineCount++;
            Scanner s = new Scanner(line).useDelimiter(" ");
            while (s.hasNext())
            {
                //word count happens here
                if(s.hasNext())
                {
                    s.next();
                    wordCount ++;
                }
                else
                    break;
            }
            if(line.isEmpty())
                emptyLines++;
            else
                lineCount++;
            line = in.readLine();


        }

        //System.out.println(line);
        System.out.println("There are " + wordCount + " words.");
        System.out.println("There are " + lineCount + " lines.");
        System.out.println("There are " + emptyLines + " empty lines.");
    }
}

