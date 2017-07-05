# player-set2
import java.util.*;
import java.io.*;
public class PowerOfTwo {
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the number"); 
    int n = sc.nextInt();
    if (isPowerOf2(n)) {
      System.out.println("Is power of 2");
    } else {
      System.out.println("Not power of 2");
    }
  }     
  private static boolean isPowerOf2(int n) {
    if (n == 0) {
      return false;
    }
    
    if (n == 1) {
      return true;
    }
    
    n = Math.abs(n);
    
    while (n > 2) {
      if (n % 2 != 0) {
        break;
      }
      n = n / 2;
    }
    
    return !(n > 2);
  }
}
