package interfacetest;

public class MultplyNumberWithTen 
{	 
	public void mul(int n)
	{
		int a = (n<<1);  //5*2^1=5*2=10
		System.out.println("a value :"+a);
		int b=  (n<<3);  //5*2^3=5*8=40
		System.out.println("b value :"+b);
		int result = a+b;
		System.out.println("Result is: "+result);
	}	
        public static void main(String[] args) 
        {			  
        	MultplyNumberWithTen ten=new MultplyNumberWithTen();
        	ten.mul(10);           	
		}
}
