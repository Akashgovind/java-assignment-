/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {
    wq[] odd = new wq[5];	// created array named odd
    for (int i = 0; i < 5; i++)
      {
	odd[i] = new wq ();	// memory allocation 
	odd[i].getDetails();
      }
  for(int i=0;i<5;i++)
  {
      odd[i].Display();
  }

  }
}
