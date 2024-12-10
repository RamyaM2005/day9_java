import java.util.*;
public class ReversingString {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String a=sc.nextLine();
     String res=" ";
     for(int i=0;i<a.length();i++)
     res=a.charAt(i)+res;
     System.out.println(res);
  }
}
