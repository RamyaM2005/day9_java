import java.util.*;
public class SplittingASentence
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     //Splitting a sentence
     String a=sc.nextLine();
     String sp[]=a.split(" ");
     System.out.println(Arrays.toString(sp));
    }
}
