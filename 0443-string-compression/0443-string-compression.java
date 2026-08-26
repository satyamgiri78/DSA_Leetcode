class Solution {
    public int compress(char[] chars) {
        int readIndex=0;
        int writeIndex=0;

        while(readIndex < chars.length)
        {
            char currentChar=chars[readIndex];
            int count=0;
            //count the duplicate
            while((readIndex <  chars.length)  && (currentChar==chars[readIndex]))
            {
                readIndex++;
                count++;

            }

            //ab duplicate aur count dono available hai
            chars[writeIndex]=currentChar;
            writeIndex++;

            //count 1 se jyada hoga tb add krna hai
            if(count >1)
            {
                String strCount=String.valueOf(count);
                for(char digit:strCount.toCharArray())
                {
                   chars[writeIndex]=digit;
                   writeIndex++;
                    
                }
            }

        }

        //return compressed char length
        return writeIndex;
    }
}