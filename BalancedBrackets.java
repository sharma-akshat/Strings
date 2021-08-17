package Strings;
import java.util.*;
class BlancedBrackets
{
    static boolean isBalanced(String expr)
    {
        Deque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<expr.length();i++)
        {
            char x=expr.charAt(i);
            if(x=='(' || x=='[' || x=='{')
            {
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()) return false;
            char check;
            switch(x){
                case ')': 
                  check=stack.pop();
                  if(check=='{' || check=='[') return false;
                  break;
                case ']': 
                  check=stack.pop();
                  if(check=='{' || check=='(') return false;
                  break;
                case '}':
                  check=stack.pop();
                  if(check=='(' || check=='[') return false;
                  break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String gg[])
    {
        String expr="([{}]){()}[][)](";
        if(isBalanced(expr)) System.out.println("Balanced");
        else System.out.println("Not balanced");
    }
}
// Time complexity for the above mentioned code is O(n);