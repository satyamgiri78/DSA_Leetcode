class Solution {
    public String removeDuplicates(String s) {
        //Stringbuilder to store character
        StringBuilder ans=new StringBuilder();
        

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            //compare right most character with current char
            
            if(ans.length()>0 && ans.charAt(ans.length()-1)==ch)
            {
                ans.deleteCharAt(ans.length()-1);
            }
            else
            {
                //agr match nhi krtahai to
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}