/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Linked {
int MemoryNumberOfBlocks;
int NumberOfFiles;
    int FileNumberOfBlocks[]=new int[NumberOfFiles];
void linked (){
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the number of Blocks in your Disk");
    MemoryNumberOfBlocks=s.nextInt();
    
    System.out.println("Enter Number Of Files");
    NumberOfFiles=s.nextInt();
    
    String FileName[]=new String[NumberOfFiles];
    for (int i = 0; i < NumberOfFiles; i++) {
        System.out.println("Enter the name of File Number -->"+(i+1));
        FileName[i]=s.next();
        System.out.println("Enter the Number of Blocks of File named -->"+FileName[i]);
        FileNumberOfBlocks[i]=s.nextInt();
    }
        





}

    
}
