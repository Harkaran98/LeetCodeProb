public class LvlEasy {


    public static void main(String[] args) {

    }


    public int[] twoSum(int[] nums, int target) {
        int i,j=0,flag=0;
        for(i=0;i<nums.length-1;i++){

        for (j=i+1;j<nums.length;j++){

            if(nums[i]+nums[j]==target){

                flag=1;
                break;
            }


        }
        if (flag==1)break;
        }

    return new int[]{i, j};
    }





}