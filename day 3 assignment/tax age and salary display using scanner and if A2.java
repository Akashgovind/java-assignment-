/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
      String name;
  int dob;
  int mob;
  int yob;
  float msalary;
  int age;
  float Asalary;
  float tax=1f;
Scanner sc=new Scanner(System.in);
System.out.println("enter name:");
name=sc.nextLine();
System.out.println("enter dob:");
dob=sc.nextInt();
System.out.println("enter mob:");
mob=sc.nextInt();
System.out.println("enter yob:");
yob=sc.nextInt();
System.out.println("enter msalary:");
msalary=sc.nextInt();
age=(2020-yob);
   Asalary=(msalary*12);
   
   if(Asalary>=500000)
   {
      tax=Asalary*0.2f; 
   }
   if(Asalary>=400000&&Asalary<=499999);
   {
      tax=Asalary*0.15f; 
   }
   if(Asalary>=300000&&Asalary<=399999)
   {
      tax=Asalary*0.10f; 
   }
   if(Asalary>=200000&&Asalary<=299999)
   {
      tax=Asalary*0.05f; 
   }
System.out.println("the name is:\t"+ name);
System.out.println("the age is:\t"+ age);
System.out.println("the annual salary is:\t"+ Asalary);
System.out.println("the tax is:\t"+ tax);
  }
}

