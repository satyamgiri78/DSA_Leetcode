class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();

        int i=s.length()-1;
        

        while(i>=0)
        {
            //removing extra spaces
            while(i>=0 && (s.charAt(i) == ' '))
            {
                 i--;
            }
            //check either the value of i are valid
            if(i<0)
            {
                break;

            }

            int j=i;
            //ab hum j ko move krenge aur waha rok denge jaha space aa jye
            while(j>=0 && (s.charAt(j) != ' '))
            {
                j--;
            }
            // ab word ko ans me appen kr dete ahi
            ans.append(s.substring(j+1,i+1));
            

            //remove space ans and searching new word to add in Stringbuilder

            while(j>=0 && (s.charAt(j) == ' '))
            {
                j--;
            }
            //add spaces in the sentences
            if(j>=0)
            {
                ans.append(' ');
            }

            //last me i ko reiniatiallised krenge
            i=j;
        }
        
        return ans.toString();
    }
}