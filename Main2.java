import java.util.Scanner;

class Main2 {
	public static void main (String[] args) throws java.lang.Exception
	{
	   char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
    
 if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
   {
     System.out.println("Alperbet");
   }
   else
   {
     System.out.println("No");
   }
 }
	 
  }
