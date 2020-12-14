/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.util.Scanner;
import javafx.scene.shape.Line;

/**
 *
 * @author Mohamed
 */
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        System.out.println("Choose one of those Algorithms:-\n");
        System.out.println("1-Contigous Memory Allocatoin\n2-Linked Memory Allocation\n3-Indexed Memory Allocation\n");
        int choice=s.nextInt();
        if (choice==1) {
         Contigous x=new Contigous();
         x.contigousAllocation();   
        }
        else  if (choice==2) {
         Linked x=new Linked();
         x.linked();
        }
         else
            System.out.println("javaapplication16.JavaApplication16.main()");

    }
    
}
