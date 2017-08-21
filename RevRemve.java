import java.io.*;
import java.util.*;
public class RevRemve{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s;
    s=sc.nextLine();
    String str="" ;
    for (int i = s.length() - 1; i >= 0; i--) { 
      str +=s.charAt(i);
    }
    System.out.println(str);
    String k = str.replaceAll("[aeiouAEIOU]", "");
    System.out.println(k);
  }
}
  
