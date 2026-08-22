class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        int end=0;

        for(int mid=0;mid<n;mid++)
        {
            
            //even palidrom ke liye
                int i=mid;
                int j=mid+1;
                

               while(i>=0 && j<n && s.charAt(i)==s.charAt(j))
               {
                i--;
                j++;
               }

               //valid palidrome ke liye index;
               if(j-i-1 > end-start+1)
               {
                start=i+1;
                end=j-1;
               }
               

               //odd palidrome ke liye
                i=mid;
                 j=mid;
                

               while(i>=0 && j<n && s.charAt(i)==s.charAt(j))
               {
                i--;
                j++;
               }

               //valid palidrome ke liye index;
               if(j-i-1 > end-start+1)
               {
                start=i+1;
                end=j-1;
               }

            
        }
        return s.substring(start,end+1);
    }
}