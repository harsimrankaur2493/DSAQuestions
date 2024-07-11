public class java1 {
    public static void printNum(int n, int x){
        
        System.out.println(x);
        if(x == n ){
            return ;
        }
        
        printNum(n, x+1);
        
        
    }

    public static void sumCalc(int i,int n, int sum){

        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sumCalc(i+1, n, sum);

    }
    public static void main(String []args){
       sumCalc(1, 5, 0);
    }
}
