class Pallindrome {
    public boolean isPalindrome(int x) {
        int reverse =0;
        int num = x;
        if(num<0){
            return false;
        }
        while(x!=0){
            int rem;
            rem=x%10;
            reverse=reverse*10+rem;
            x/=10;
        }
        if(reverse==num){
            return true;
        }
        return false;
    }
}
//Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.
