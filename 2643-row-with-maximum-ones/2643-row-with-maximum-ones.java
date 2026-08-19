class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int m=mat.length;
        int n=mat[0].length;
        
        int max=-1;
        int index=-1;

        //row ke liye loop chalao
        for(int row=0;row<m;row++)
        {
            int count=0;
            //col ke liye loop chalo
            for(int col=0;col<n;col++)
            {
                if(mat[row][col]==1)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                index=row;
            }

        }

        return new int[]{index,max};
        
    }
}