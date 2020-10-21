import java.util.Scanner;
public class wq
{
    int num;
    public void getDetails()
    {
  Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    num = sc.nextInt ();
   // System.out.println(" the number"+num);
    }
 public void Display()
 {
  if (num / 2 != 1)
    {
      System.out.println (num+" "+"is odd");
    }
  
}
}