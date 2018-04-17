package interfacetest;

public class Palindrome 
{
 public static void main(String[] args) {
	String name="mom";
	String r="";
	String ss="";
	
	for (int i=name.length()- 1;i>=0;i--)
	{
		 r =r+ name.charAt(i);
		System.out.println("reversed: "+r);
	}
	if (name.equals(r))
		  System.out.println(name+" is a palindrome");
     else
        System.out.println(name+" OOPS....... not a palindrome");
}
	
}
