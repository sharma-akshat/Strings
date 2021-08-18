import java.util.*;
class RedundantBrackets
{
    static boolean findRedundancy(String s)
    {
        Stack<Character> st=new Stack<>();
        char[] str=s.toCharArray();
        for(char ch:str)
        {
            if(ch==')')
            {
                char top=st.peek();
                st.pop();
                boolean result=true;
                while(top!='(')
                {
                    if(top=='+' || top=='-' || top=='*' || top=='/')
                    {
                        result=false;                        
                    }
                    top=st.peek();
                    st.pop();
                }
                if(result==true) return true;
            }
            else{
                st.push(ch);
            }
        }
        return false;
    }
    static void findRedundantBrackets(String s)
    {
        if(findRedundancy(s)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void main(String gg[])
    {
        String expr1="((a+b))";
        findRedundantBrackets(expr1);
        String expr2="(((a+b)+c)+d)";
        findRedundantBrackets(expr2);
    }
}
//Time complexity for the above mentioned code snippet is O(n)