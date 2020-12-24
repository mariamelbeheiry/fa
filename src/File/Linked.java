/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Linked {
int MemoryNumberOfBlocks;
int NumberOfFiles;
void linked (){
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the number of Blocks in your Disk");
    MemoryNumberOfBlocks=s.nextInt();
    
    System.out.println("Enter Number Of Files");
    NumberOfFiles=s.nextInt();
        int FileNumberOfBlocks[]=new int[NumberOfFiles];

    String FileName[]=new String[NumberOfFiles];
    for (int i = 0; i < NumberOfFiles; i++) {
        System.out.println("Enter the name of File Number -->"+(i+1));
        FileName[i]=s.next();
        System.out.println("Enter the Number of Blocks of File named -->"+FileName[i]);
        FileNumberOfBlocks[i]=s.nextInt();
    }
     Random rand = new Random();
     int index;
    //ArrayList<String> x=new ArrayList<>();
    String x[]=new String[MemoryNumberOfBlocks];
     
    
        for (int i = 0; i <NumberOfFiles; i++) {
            System.out.print("FileNamed\t"+FileName[i]+"\tBlocks in memory are");
            for (int j = 0; j < FileNumberOfBlocks[i]; j++) {
                 index=rand.nextInt(MemoryNumberOfBlocks);
                 int ctr=0;
                
                 while (ctr<MemoryNumberOfBlocks) {                    
                    
                 if (x[index]==null) {
                    x[index]=FileName[i];
                     System.out.print("\t"+index);
                break;
                 }
                 ctr++;
                         
                     
            }                }
            System.out.println("");
    }
        System.out.println("n\n\n");
  
            for (int j = 0; j <MemoryNumberOfBlocks; j++) {
                System.out.print(x[j]+"\t");
                if (j%10==0) { System.out.println("\n");

                }
            }




}

    
}
