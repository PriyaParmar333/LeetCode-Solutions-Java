package ArraysAndHashing;

public class isAnagram
{
    public static boolean isAnagram(String s,String t){
        int l1=s.length();
        int l2=t.length();
        int[] count=new int[26];
        if(l1 != l2){
            return false;
        }
        for(int i=0;i<l1;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i] !=0)
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        String s="amj ";
        String t="jam";
        System.out.println(isAnagram(s,t));
    }
}
