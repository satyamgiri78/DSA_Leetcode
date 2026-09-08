class Solution {
    public String addSpaces(String s, int[] spaces) {
        int j=0;

        StringBuilder ans=new  StringBuilder();

        //string ko traverse krenge aur jaha bhi i==j ho jye waha space add kr dena

        for(int i=0;i<s.length();i++)
        {
            if(j< spaces.length && i==spaces[j])
            {
                ans.append(" ");
                j++;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}