

package com.mycompany.finalproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
    System.out.println("Enter web site" ); //input web site for blocked
    Scanner x = new Scanner(System.in);
    String X = x.nextLine();
    
    
   
   
    try{
        FileWriter fw = new FileWriter ("C:\\Windows\\System32\\drivers\\etc\\hosts.file");//blocked processing file handling
        fw.write("127.0.0.1 " + X);
        fw.close();
    }catch (IOException e){
    }
    }
    
}
