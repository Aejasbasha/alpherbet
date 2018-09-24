import java.util.Scanner;
class leapyear 
{
    public static void main(String args[])
    {
      int yr;
        Scanner s = new Scanner(System.in);
        yr = s.nextInt();
       
       
        if(yr%4==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println(" no ");
        }
    }
}
