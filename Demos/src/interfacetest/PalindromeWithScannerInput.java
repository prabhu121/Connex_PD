package interfacetest;

public class PalindromeWithScannerInput

{
 String rev=""; 
 
 public void checkPalindrome(String num)
 {
	 for(int i=num.length()-1;i>=0;i--)
	 {
		 rev=rev+num.charAt(i);
	 }
	 if(num.equals(rev))	
	 System.out.println(num+ ": Congrats its a palindrome");
	 else
		 System.out.println(num+ ": OOPS........Not a palindrome");
 }
	
	
}
