class Solution {
    public int maxArea(int[] height) {

        int i=0;
        int j=height.length-1;
        int area=0;

        while(i<j)
        {
            //jiski height kam hogi wahi heigth consider krenge
            //maximu area ke maximum range + max height honi chahiye
           if(height[i] >= height[j])
           {
            if(area < height[j]*(j-i) )
            {
                area=height[j]*(j-i);
            }
            j--;
           }
           else
          {
            if(area < height[i]*(j-i) )
            {
                area=height[i]*(j-i);
            }
            i++;
           }
           
        }

        
        return area;
    }
}