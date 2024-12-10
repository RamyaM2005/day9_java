import java.util.*;
class EvenCharacteredString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String ans=" ";
       for(int i=0;i<a.length();i+=2)
       {
        ans+=a.charAt(i);
    }
    System.out.println(ans);
}
}
