class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tt = 0;

        while(sp < s.length() && tt < t.length()){
            if(s.charAt(sp) == t.charAt(tt)){
                 sp++;

            }
           tt++;
        }
        return sp == s.length();
    } 
}