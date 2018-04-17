package interfacetest;

import java.util.Scanner;

public class MainClass 
{
      public static void main(String[] args) 
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the String value to find Palindrome");
    	  String st = sc.nextLine();    	  
    	  PalindromeWithScannerInput p=new PalindromeWithScannerInput();
    	  p.checkPalindrome(st);
      }
}
