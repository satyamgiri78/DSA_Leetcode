class Solution {
    public String removeOccurrences(String s, String part) {

        //tb tk loop chle jab tk part wala s se remove na ho jye
        while(s.contains(part))
        {
            //part ka index string me search kro
            int index=s.indexOf(part);
            s=s.substring(0,index)+s.substring(index+part.length());

        }
        return s;
        
    }
}