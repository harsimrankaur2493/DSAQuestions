public class exponential {
    
   public static int power(int x, int n){
      //x is the number
      //n is the power

      if(n==0){   //base case 1
         return 1;
      }
      if(x==0){   //base case 2
         return 0;
      }
      int xnm1= power( x,  n-1); // calculates x^(n-1)
      int xn= x* xnm1;  //x= x*x^(n-1)
      return xn;        
   }

   public static void main(String []args){
      System.out.println(power(2,3));
   }
}
