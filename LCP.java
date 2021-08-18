package Strings;
class LCP
{
    static String largestCommonPrefix(String str1,String str2)
    {
        String result="";
        int n1=str1.length(), n2=str2.length();
        for(int i=0,j=0;i<n1 && j<n2;i++,j++)
        {
            if(str1.charAt(i)!=str2.charAt(i)) break;
            result+=str1.charAt(i);
        }
        return result;
    }
    static String commonPrefix(String[] arr,int n)
    {
        String prefix=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix=largestCommonPrefix(prefix,arr[i]);
        }
        return prefix;
    }
    public static void main(String gg[])
    {
        String arr[]={"aaaaaababab","aabbbaaa","aaaaa","aaabbbccc"};
        int n=arr.length;
        String answer=commonPrefix(arr,n);
        if(answer.length()>0) System.out.println("The longest common prefix is : "+answer);
        else System.out.println("There is no common prefix");
    }
}