import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
class items{
    float weight, profit, ratio;
    int id;

    public items(float weight , float profit , int id){
        this.weight = weight;
        this.profit = profit;
        this.ratio = profit/weight;
        this.id=id;

    }

}
public class Knapsack{
    public static float knap(float W,  items[] objects){
        Arrays.sort(objects, new Comparator<items>() {
            public int compare(items a, items b) {
                return Double.compare(b.ratio, a.ratio);
            }
        });

        float totalProfit = (float)0.0;
        System.out.println("Items selected:");
        for(items item : objects){
            if(W ==0){
                break;
            }

            if(item.weight <=W){
                W-=item.weight;
                totalProfit +=item.profit;
                System.out.println("weight:  " + item.weight + "  profit:  " + item.profit + " id: " + item.id );
            }
            else{
                totalProfit += item.ratio*W;
                System.out.println("Item with weight: " + W + ", profit: " + (item.ratio * W) + " (fractional)"+ " id: " + item.id );
                W=0;

            }
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        items[] objects = {
            new items(2, 10 ,1),
            new items(3, 5 ,2),
            new items(5, 15 ,3),
            new items(7, 7 ,4),
            new items(1, 6 ,5),
            new items(4, 18 ,6),
            new items(1, 3 ,7)
        };
        float W = 15;
        float maxProfit = knap(W, objects);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
