import java.util.Scanner;
    public class Vowels_Consonents_numbs_Char_Count 
    {
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            // Vowel count 
            int vc=0;  
            // Consonant count
            int cc=0; 
            // Number count 
            int nc=0; 
            // Special character count
            int sp=0; 
            for (int i=0;i<s.length();i++)
             {
                char ch=s.charAt(i);
                // Check if the character is a vowel 
                if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
                    ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
                    {
                    vc++;
                }
                // Check if the character is a consonant 
                else if (Character.isAlphabetic(ch) && !(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
                                                          ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) 
                                                          {
                    cc++;
                }
                // Check if the character is a number
                else if (Character.isDigit(ch)) 
                {
                    nc++;
                }
                // else it is a special character
                else 
                {
                    sp++;
                }
             }
            System.out.println("Vowels Count: " + vc);
            System.out.println("Consonant Count: " + cc);
            System.out.println("Numbers Count: " + nc);
            System.out.println("Special Character Count: " + sp);
        }
    }
    
