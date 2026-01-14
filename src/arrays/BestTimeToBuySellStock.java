package arrays;

//[Expected Approach] One Traversal Solution – O(n) Time and O(1) Space
public class BestTimeToBuySellStock {

    public static int buySellStock(int[] stockprice){
        int minValue = stockprice[0];
        int result = 0;

        for (int i = 0; i < stockprice.length; i++){
            minValue = Math.min(minValue, stockprice[i]);
            result = Math.max(result, stockprice[i] - minValue );
        }
        return result;
    }


    public static void main(String[] args) {
        int[] stockprice = {3,7,9,2,1,5,8,4};
        System.out.println(buySellStock(stockprice));

    }
}
