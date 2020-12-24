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
int MNB;
void linked (){
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the number of Blocks in your Disk");
    MemoryNumberOfBlocks=s.nextInt();
    MNB=MemoryNumberOfBlocks;
    System.out.println("Enter Number Of Files");
    NumberOfFiles=s.nextInt();
        int FileNumberOfBlocks[]=new int[NumberOfFiles];

    String FileName[]=new String[NumberOfFiles];
    for (int i = 0; i < NumberOfFiles; i++) {
        System.out.println("Enter the name of File Number -->"+(i+1));
        FileName[i]=s.next();
        System.out.println("Enter the Number of Blocks of File named -->"+FileName[i]);
        FileNumberOfBlocks[i]=s.nextInt();
    //MNB-=FileNumberOfBlocks[i];
    }
     Random rand = new Random();
     int index;
    //ArrayList<String> x=new ArrayList<>();
    String x[]=new String[MemoryNumberOfBlocks];
     
    
        for (int i = 0; i <NumberOfFiles; i++)
        {
            System.out.print("FileNamed\t"+FileName[i]+"\tBlocks in memory are");
            for (int j = 0; j < FileNumberOfBlocks[i]; j++)
            {
                 index=rand.nextInt(MemoryNumberOfBlocks);                    
                 while (true)
                 {                    
                    
                    if (x[index]==null) 
                    {
                        x[index]=FileName[i];
                        System.out.print("\t"+index);
                        break;
                    }
                    else  if (x[index]!=null)
                    {
                        index=rand.nextInt(MemoryNumberOfBlocks);    
                 
                     }
                 
                         
                     
                }                
            }
 System.out.println("");
        }
      
            }






    
}
