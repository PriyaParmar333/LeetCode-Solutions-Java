package ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean ContainsDuplicate(int nums[])
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            if(hs.contains(num))
            {
                return true;
            }
            hs.add(num);
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
        System.out.println(ContainsDuplicate(nums));
    }
}
