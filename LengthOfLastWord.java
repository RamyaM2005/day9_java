import java.util.*;
public class LengthOfLastWord 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
         // Split the string  
        String[] s1=s.split(" "); 
        int d=s1.length; 
        // Get the last character of the string         
        String h=s1[d-1];       
         // Print the length of the last character
        System.out.println(h.length()); 
    }
}
