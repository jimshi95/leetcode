class Solution {
    public static boolean detectCapitalUse(String word) {
        if(word.length()==1) return true;

        boolean answer=true;
        boolean startCap= (Character.isUpperCase(word.charAt(0)));
        if(startCap==false){
            for(int i=1;i<word.length();i++)
                if(Character.isUpperCase(word.charAt(i)))
                    answer=false;
        }
        else if(Character.isUpperCase(word.charAt(1))){
            for(int i=1;i<word.length();i++)
                if(!Character.isUpperCase(word.charAt(i)))
                    answer=false;
        }
        else{
            for(int i=1;i<word.length();i++)
                if(Character.isUpperCase(word.charAt(i)))
                    answer=false;
        }
        return answer;

    }


}