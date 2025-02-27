class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder reverse = new StringBuilder();
        for(String str : arr){
            reverse.append(new StringBuilder(str).reverse().append(" "));
        }
        return reverse.toString().trim();
    }
}