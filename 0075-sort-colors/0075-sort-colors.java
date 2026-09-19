class Solution {
    public void sortColors(int[] nums) {

        int low=0;
        int mid=0;
        int high=nums.length-1;
    


        while(mid<=high)
        {
            if(nums[mid]==0)
            {
              int temp=0;

              temp=nums[low];
              nums[low]=nums[mid];
              nums[mid]=temp;

              low++;
              mid++;



            }

            else if(nums[mid]==1)
            {
                mid++;
            }

            else{
                //nums[mid]==2
                //swap nums[mid] and nums[high]

                int temp1=0;

                temp1=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp1;

                high--;

            }
        }
        
    }
}