import java.util.Scanner;
public class addition
{
  int n1, n2, n3, n4, n5, add;
  public void getDetails ()
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the number:");
      n1 = sc.nextInt ();

      System.out.println ("Enter the number:");
      n2 = sc.nextInt ();

      System.out.println ("Enter the number:");
      n3 = sc.nextInt ();

      System.out.println ("Enter the number:");
      n4 = sc.nextInt ();

      System.out.println ("Enter the number:");
      n5 = sc.nextInt ();
  }

  public void setDisplay ()
  {
    add = n1 + n2 + n3 + n4 + n5;
    System.out.println ("total value is" + add);
  }
}
