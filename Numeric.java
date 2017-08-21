import java.io.*;
import java.util.*;
public class Numeric {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);   
    String string = sc.nextLine();;
    boolean numeric = true;
    
    try {
      Double num = Double.parseDouble(string);
    } catch (NumberFormatException e) {
      numeric = false;
    }
    
    if(numeric)
    System.out.println("True");
    else
    System.out.println("False");
  }
}
