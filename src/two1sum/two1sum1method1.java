package two1sum;

//第一种方法，暴力破解法
//遍历每个元素，看是是否存在符合要求的目标


public class two1sum1method1 {


    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j= i+1;j<nums.length;j++)
            {
                if(nums[j]+nums[i]==target)
                {
                    return new int[]{ i,j };
                }

            }
        }
        return null;
    }

}
