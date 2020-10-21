/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {

    avengers[] list=new avengers[5];//creating an array named list having 5 Objects
    //to allocate memory using for loop
for(int i=0;i<5;i++)
{
    list[i]=new avengers();//5 Objects with memory are created
    list[i].getDetails();// gets details for 5 obj
}
for(int i=0;i<5;i++)
{
    list[i].displayDetails();// displayDetails for 5 Objects
}
}
}
