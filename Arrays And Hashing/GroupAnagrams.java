package ArraysAndHashing;

import java.util.*;

public class GroupAnagrams
{
    public static List<List<String>> groupAnagram(String[] str){
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String word:str){
            char[] chars=word.toCharArray();// breaks string into individual char
            Arrays.sort(chars);//sort the chars
            String key=new String(chars);//make sorted char again back to string

            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());//inserts new key into hashmap
            }
            hm.get(key).add(word);//adds value into the existing list at that key
        }
        return new ArrayList<>(hm.values());
    }
    public static void main(String[] args)
    {
        String[] str={"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagram(str));
    }
}
