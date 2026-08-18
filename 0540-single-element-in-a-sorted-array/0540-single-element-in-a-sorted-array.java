class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n=nums.length;

        int start=0;
        int end=n-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(start==end)
            {
                return nums[start];
            }

            int currentValue= nums[mid];
           // previous value 
            int previousValue=-1;
            if(mid-1 >=0)
            {
                previousValue=nums[mid-1];
            }

            //nextvalue
            int nextValue=-1;
            if(mid+1 <n)
            {
                nextValue=nums[mid+1];
            }


             //unique element mil gya
            if((currentValue != previousValue) && (currentValue != nextValue))
            {
                return currentValue;
            }
            // agr nhi mila to 

            else if((currentValue != previousValue) && (currentValue == nextValue))
            {
                int startingIndex=mid;

                if((startingIndex & 1)==1)
                {
                    end= mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

            else if((currentValue == previousValue) && (currentValue != nextValue))
            {
                int endingIndex=mid;

                if((endingIndex & 1)==1)
                {
                    start=mid+1;
                    
                }
                else
                {
                   end= mid-1; 
                }
            }
            
            
        }

        return -1;
        
    }
}