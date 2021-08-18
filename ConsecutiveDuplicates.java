package Strings;

import java.util.Arrays;

class ConsecutiveDupicates
{
    
    /*
    public static String removeConsecutiveDuplicates(String str)
    {
        if(str.length()<=1) return str;
        if(str.charAt(0)==str.charAt(1)) return removeConsecutiveDuplicates(str.substring(1));
        else return str.charAt(0)+removeConsecutiveDuplicates(str.substring(1));
    }
    */
    // Above mentioned code is a recursive approach

    static void removeConsecutiveDuplicates(char[] s)
    {
        int l=s.length;
        if(l<2) return;
        int j=0;
        for(int i=1;i<l;i++)
        {
            if(s[j]!=s[i])
            {
                j++;
                s[j]=s[i];
            }
        }
        System.out.println(Arrays.copyOfRange(s, 0, j+1));
    }
    // Above mentioned code is an iterative approach
    public static void main(String gg[])
    {
        //String s="abaabbc"
        //System.out.printl(removeConsecutiveDuplicates(s));
        
        char[] s1="abaabbaaaaccbbb".toCharArray();
        removeConsecutiveDuplicates(s1);
        char[] s2="abcde".toCharArray();
        removeConsecutiveDuplicates(s2);
    }
}
