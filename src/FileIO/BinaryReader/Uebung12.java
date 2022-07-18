package FileIO.BinaryReader;

import java.io.*;

public class Uebung12 {
    public static void main(String[] args) throws IOException {
        //choose which file to read from while initializing a new file object
        File file = new File("text.txt");
        //Open the Input stream, giving the file as parameter
        FileInputStream fileInputStream = new FileInputStream(file);
        //open the buffered stream, giving the first input stream as parameter
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        //create a laufvariable to go through each character of the file
        int byteRead;
        //while loop to go through file until its over, where it returns the value of -1
        while ((byteRead = bufferedInputStream.read()) != -1) {
            // cast the int to char so that it gives back characters instead of numbers,
            //and print it without a line so that it doesnt separate each single character in a new line
            System.out.print((char) byteRead);

            //another way to print the text, making an array with the characters and casting the int in a different way
            char [] ch = Character.toChars(byteRead);
            System.out.println(ch);
        }
        bufferedInputStream.close();

    }
}
