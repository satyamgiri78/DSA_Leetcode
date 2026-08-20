class Solution {
    public int appendCharacters(String s, String t) {
        int m=s.length();
        int n=t.length();

        int i=0,j=0;
        int last=0;

        while((i<m) && (j<n))
        {
            //har character ko macth kro dono string ka
            if(s.charAt(i)==t.charAt(j))
            {
               i++;
               j++;
            }
            else
            //agr character na mile to aage badh jaye
            {
                i++;
                
            }
             last=j;
        }

        //last me subsequences me jo bach gya usko string mr add krna pdega
        int  result=n-j;
        return result;
        
    }
}