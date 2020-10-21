/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
	addition[] list=new addition[5];// list obj is created 	
		for(int i=0;i<5;i++)
		{
		  list[i]=new addition();// memory allocation
		    list[i].getDetails();
		}
	for(int i=0;i<5;i++)
		{
		  
		    list[i].setDisplay();
		}
	}
}
