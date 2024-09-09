class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase();
       StringBuilder sb= new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            sb.append(s.charAt(i));
        }
       } 
       int i=0;
       int j=sb.length()-1;
       while(i <=j){
        if(sb.charAt(i)==sb.charAt(j)){
           i++;
            j--;
        }
        else{
            return false;
        }
        
       } 

       return true;     
    }
}