/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viva1;

/**
 *
 * @author jiaqi
 */
import java.util.Scanner;
import java.util.ArrayList;
public class code1 {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int even=0, another, verified=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        for (int i =0; i<1;){   
            System.out.print("Enter an even integer that is greater than 2: ");
            even =  sc.nextInt();
            if (even>2 && even%2==0)
                i++;
            else
                System.out.println("Error: You have entered an odd integer or an even integer less than or equal to 2. Plaease enter a valid input.");
        }
        
        for (int i=even-1;i>=2;i--){
            int numCan=0, num2Can=0, numRepeat=0;
            for (int k=2; k<i;k++){
                if (i%k==0)
                        numCan++;
            }
            if (numCan==0){
                another = even-i;                
                if (another==2){
                    verified++;
                    if (verified==1)
                        System.out.println("The input integer can be expressed as the sum of two prime numbers.");
                    System.out.format("%d = %d + %d%n", even, another, i);      
                }
                else{
                    for (int j=2;j<another;j++){
                        if (another%j==0)
                            num2Can++;            
                    }
                    if (num2Can==0){
                        verified++;
                        if (verified==1)
                            System.out.println("The input can be expressed as the sum of two prime numbers.");                        
                        for (int m: arr){
                            if (m==another|| m==i)
                                numRepeat++;
                        }                            
                        if (numRepeat==0)
                            System.out.format("%d = %d + %d%n", even, another, i);
                        arr.add(another);arr.add(i);
                    }
                }
            }
        }
        if (verified ==0)
            System.out.println("Sorry, Goldbach's Conjecture is not satisfied for the given output.");
    }
}
