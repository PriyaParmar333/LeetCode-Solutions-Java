class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        //Step 1:count frequency
        //(1=>exists=>no then 0+1 ==> 1) {1=[1]}
        //(2=>exists=>no then 0+1 ==> 1) {2=[1]}
        //(2=>exists=>yes then 1+1 ==>2) [2=[2]]
        //(3=>exists=>no then 0+1 ==> 1) {3=[1]}
        //(3=>exists=>yes then 1+1 ==> 2) {3=[2]}
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        //Step 2:Create a bucket
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }//bucket[0]=[] bucket[1]=[]
        //Step 3:put the numbers in the bucket based on the frequency
        for(int key : hm.keySet()){//gives all the numbers stored in the hashmap
            int freq=hm.get(key);//get the frequency of that number
            bucket[freq].add(key);
        }
        // Step 4: Traverse bucket from end (highest frequency)
        int[] result=new int[k];
        int index=0;
        for(int i = bucket.length - 1; i >= 0 && index < k; i--){
            for(int num : bucket[i]){
                result[index++] = num;
                if(index == k){
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={1,2,2,3,3,3};
        int k=2;
        System.out.println(topKFrequent(nums,k));
    }
}
