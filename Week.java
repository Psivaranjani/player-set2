import java.io.*;
import java.util.*;
public class Week{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s;
    System.out.println("Enter the day");
    s=sc.nextLine();  
    if(s.equalsIgnoreCase("monday")||s.equalsIgnoreCase("tuesday")||s.equalsIgnoreCase("wednesday")||s.equalsIgnoreCase("thursday")||s.equalsIgnoreCase("friday"))
    {
      System.out.println(true);
    }
    else
    System.out.println(false);
  }
} 
  
  
  
