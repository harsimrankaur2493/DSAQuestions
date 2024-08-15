class plusOne {
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1] +=1;
        
            int i=digits.length-1;
            while(i>0 && digits[i] ==10){
                digits[i-1]+=1;
                digits[i]%=10;
                i--;
            }
           if(digits[0] >9){
            int digitsnew[]=new int[digits.length+1];
            digitsnew[0] = digits[0]/10;
            digitsnew[1] = digits[0]%10;
            return digitsnew;
           }

        return digits;
    }
    public static void main(String []args){
        int digits[]={9,9,9,9};
        int digits1[]=plusOne(digits);
        for(int i=0;i<digits1.length;i++){
            System.out.println(digits1[i]);
        }        
    }
}


/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.*/
