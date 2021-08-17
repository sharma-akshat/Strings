package Strings;
import java.util.*;
class Pallindrome
{
    static boolean isPallindrome(String str)
    {
        int i=0,j=str.length()-1;
        String reverse="";
        for(i=str.length()-1;i>=0;i--) reverse=reverse+str.charAt(i);
        while(i<j)
        {
            if(str.equalsIgnoreCase(reverse)) return true;
        }
        return false;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        if(isPallindrome(str)) System.out.println("Pallindrome");
        else System.out.println("Not a pallindrome");
        sc.close();
    }
}