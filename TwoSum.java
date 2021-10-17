public class TwoSum{

    public int[] sum(int[] nums,int target){

        int[] small_than_target = {};

        int count = 0;

        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] == target-nums[i]){
                    System.out.println(nums[i]+nums[j]);
                    return new int[]{i,j};
                    
                }
            }
        }

        return null;

    }


    public static void main(String args[]){

        TwoSum t = new TwoSum();


    }
}