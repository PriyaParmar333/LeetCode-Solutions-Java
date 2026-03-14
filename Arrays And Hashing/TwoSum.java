package ArraysAndHashing;

import java.util.HashMap;

public class TwoSum
{
    public static int[] twoSum(int nums[] ,int target){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ReqNum=target-nums[i];
            if(hm.containsKey(ReqNum)){
                int[] ans={
                        hm.get(ReqNum),i
                };
                return ans;
            }
            hm.put(nums[i],i);

        }
        return null;
    }
    public static void main(String[] args)
    {
        int[] nums={3,4,5,6};
        int target=9;
        int[] result=twoSum(nums,target);//function call
        System.out.println(result[0]+" "+result[1]);
    }
}
