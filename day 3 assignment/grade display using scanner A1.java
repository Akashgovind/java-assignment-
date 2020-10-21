
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    int s1;
    int s2;
    int s3;
    int s4;
    int s5;
    float t;
    float a;
    float p;

    Scanner sc = new Scanner (System.in);
      System.out.println ("enter s1 mark\t:");
      s1 = sc.nextInt ();

    if (s1 > 100 || s1 < 0)
      {
	System.out.println ("enter marks out of 100 only\n" +
			    "enter orginal mark");
	s1 = sc.nextInt ();
      }

    System.out.println ("enter s2 mark\t:");
    s2 = sc.nextInt ();
    if (s2 > 100 || s2 < 0)
      {
	System.out.println ("enter marks out of 100 only\n" +
			    "enter orginal mark");
	s2 = sc.nextInt ();
      }

    System.out.println ("enter s3 mark\t:");
    s3 = sc.nextInt ();
    if (s3 > 100 || s3 < 0)
      {
	System.out.println ("enter marks out of 100 only\n" +
			    "enter orginal mark");
	s3 = sc.nextInt ();
      }

    System.out.println ("enter s4 mark\t:");
    s4 = sc.nextInt ();
    if (s4 > 100 || s4 < 0)
      {
	System.out.println ("enter marks out of 100 only\n" +
			    "enter orginal mark");
	s4 = sc.nextInt ();
      }

    System.out.println ("enter s5 mark\t:");
    s5 = sc.nextInt ();
    if (s5 > 100 || s5 < 0)
      {
	System.out.println ("enter marks out of 100 only\n" +
			    "enter orginal mark");
	s5 = sc.nextInt ();
      }


    t = (s1 + s2 + s3 + s4 + s5);
    a = (t / 500);
    p = ((a) * 100);
    System.out.println ("the total :\n" + " " + t);
    System.out.println ("the total avg:\n" + " " + a);
    System.out.println ("the total percentage:\n" + " " + p);

    if (p <= 100.0 && p >= 85.0)
      {
	System.out.println ("grade A");
      }

    if (p <= 84.0 && p >= 75.0)
      {
	System.out.println ("grade B");
      }

    if (p <= 74.0 && p >= 65.0)
      {
	System.out.println ("grade C");
      }
    if (p <= 64.0 && p >= 0.0)
      {
	System.out.println ("FAIL");
      }
  }
}

