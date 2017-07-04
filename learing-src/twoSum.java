/*
leet.NO1.towSum
scy
*/
static int[] twoSum(int[]nums,int target){
             Map <Integer,Integer>hash=new HashMap<Integer,Integer>();
             int []res=new int[2];
             for (int i=0;i<nums.length;i++){
                 if(hash.containsKey(target-nums[i])){
                     res[0]=hash.get((target-nums[i]));
                     res[1]=i;
                     return res;
                 }
                 hash.put(nums[i],i);
             }

             return res;
        }
        