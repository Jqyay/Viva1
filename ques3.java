/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viva1;

/**
 *
 * @author jiaqi
 */
import java.util.Scanner; //import Scanner class
import java.util.ArrayList;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create an object for Scanner class
        ArrayList<Character> digitInString = new ArrayList<Character>();
        //variable declaration
        String bin;
        double dec=0; 
        
        System.out.print("Enter binary number: "); //prompt user to input binary number
        bin = sc.nextLine(); //read user input
        sc.close(); //close scanner
        
        int positionDecimalPoint=0;
        for (int i=0; i<bin.length();i++){
            digitInString.add(bin.charAt(i));
            if ((digitInString.get(i))=='.'){
                positionDecimalPoint = i;
            }
        }
        
        int[] positivePlace = new int [positionDecimalPoint];
        for (int j=0;j<positionDecimalPoint;j++)
            positivePlace[j]=positionDecimalPoint-1-j;
                
        int[] negativePlace = new int [bin.length()-positionDecimalPoint];
        for (int k=0,m=-1;k<negativePlace.length;k++,m--)
            negativePlace[k]=m;
                
        int[][]powerTo = {positivePlace,negativePlace};
        digitInString.remove(positionDecimalPoint);
               
        int[] digit = new int [digitInString.size()];
        for (int n=0;n<digit.length;n++)
            digit[n] = Character.getNumericValue(digitInString.get(n));
        
        for (int q=0;q<powerTo.length;q++){
            for (int r=0,t=0;r<powerTo[q].length&&t<digit.length;r++,t++){
                dec+=((digit[t])*(Math.pow(2,powerTo[q][r])));  
                System.out.print(digit[t]+ " ");
            }
        }
        
        System.out.format("Decimal value of binary number %s is %f", bin,dec);
    }
}
