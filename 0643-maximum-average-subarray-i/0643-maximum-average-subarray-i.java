class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0;
        int j=k-1;
        double sum=0;
        

        for(int index=i;index<=j;index++)
           {
             sum+=nums[index];
           } 

           double max=sum;
            
        while(j<nums.length-1)
        {
            sum=sum-nums[i];
            i++;
            j++;

            sum=sum+nums[j];
            max=Math.max(max,sum);
        }   
           
        
        return max/k;
        
    }
}