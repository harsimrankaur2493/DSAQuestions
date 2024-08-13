class LastWord {
    public int lengthOfLastWord(String s) {
          /**
        follow pointer approach
        start from the last and keep decreasing pointer until encounter white pace 
        keep a counter ++ which increments until the white space is encountered
        */
        int count=0;
        int ptr=s.length()-1;

        while(ptr >=0 && s.charAt(ptr) == ' '){
            ptr--; //trimming the trailing white spaces
        }
        while(ptr>=0 && s.charAt(ptr) !=' '){
            count++;
            ptr--;
        }     

        return count;
        /**
         * can count till which place is the last word , extract that last word
         * then count the length
    */

    }
}
// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.
