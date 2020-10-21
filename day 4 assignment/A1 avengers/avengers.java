import java.util.Scanner;
public class avengers
{
  String name, power, planet, weapon;
  int age;
  public void getDetails ()
  {
    Scanner sc = new Scanner (System.in);
    
      System.out.println ("Enter the name:");
      name = sc.nextLine ();
      
      
      System.out.println ("Enter the power:");
      power = sc.nextLine ();
     
      System.out.println ("Enter the planet:");
      planet = sc.nextLine ();
      
      System.out.println ("Enter the weapon:");
      weapon = sc.nextLine ();
      
      System.out.println ("Enter the age:");
      age = sc.nextInt ();
  }
public void displayDetails ()
    {
        System.out.println ("The name is:\t" + name);
        System.out.println ("The age is:\t" + age);
        System.out.println ("The power is:\t" + power);
        System.out.println ("The planet is:\t" + planet);
        System.out.println ("The weapon is:\t" + weapon);
    }
}
