package interfacetest;

public class ReversOfString
{
    public static void main(String[] args) 
    {
    	String name="PRABHU";
    	String reverse="";
    	//1St method 
    	/*StringBuffer sf=new StringBuffer(name);
    	System.out.println("Reverse of a string is: "+sf.reverse());	*/
    	
    	//2nd Method
    	for(int i=name.length()-1;i>=0;i--)
    	{
    		reverse=reverse+name.charAt(i);    		
    	}
    	System.out.println("Reverse of a string is: "+reverse);
    }
}
