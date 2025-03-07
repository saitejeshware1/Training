class Solution {
    public String finalString(String s) {
        StringBuilder ss=new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='i')ss.append(ch);
            else ss.reverse();
        }
        return ss.toString();
        
    }
}