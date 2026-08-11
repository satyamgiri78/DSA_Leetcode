class Solution {
    public int addDigits(int num) {
      
    //   int sum=0;
    //     while(num!=0)
    //     {
    //         int digit=num%10;
    //         sum=sum+digit;
    //         num=num/10;

    //     }
    //     if(sum<10)
    //     {
    //         return sum;
    //     }
        
        
    //         return addDigits(sum);
        
        

        //follow up approach

        if(num==0)
        {
            return 0;
        }

        return 1+(num-1)%9;
    
    }
}