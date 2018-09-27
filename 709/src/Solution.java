public class Solution {
    public String toLowerCase(String str){
        char c;
        String s="";
        for(int i=0;i<str.length();i++){//go though every character and convert to lowercase if its upper case
            c=str.charAt(i);
            if(c>=65&&c<=90){
                s=s+(char)( (c + 32) );
            }
            else
                s=s+str.charAt(i);
        }
        return s;
    }

