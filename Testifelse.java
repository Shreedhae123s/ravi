package ananya;


import java.util.Scanner; 
class Testifelse
{
	  public static void main(String[]args)
	  {
		  int n;
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter then number you want to check:");
		  n=s.nextInt();
		  if(n%2==0)
		  {
			  System.out.println("The given number"+n+" is Even");
		  }
		  else
		  {
			  System.out.println("The given number"+n+" is add");
			 
		  }
	  }
	
}
