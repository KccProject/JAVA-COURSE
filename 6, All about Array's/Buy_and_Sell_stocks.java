public class Buy_and_Sell_stocks {
    public static void Profit(int arr[]){
        int size = arr.length;
        int Maxprofit=0;
        int MinPriceToBuy[] = new int[size];
        int MaxPriceToSell[] = new int[size];
        MinPriceToBuy[0] = arr[0];
        for(int i=1;i<size;i++) MinPriceToBuy[i] = Math.min(MinPriceToBuy[i-1],arr[i]);
        //for(int i=0;i<size;i++) System.out.print(MinPriceToBuy[i]);
        //System.out.println();
        MaxPriceToSell[size-1] = arr[size-1];
        for(int i=size-2;i>=0;i--) MaxPriceToSell[i] = Math.max(MaxPriceToSell[i+1],arr[i]);
        //for(int i=0;i<size;i++) System.out.print(MaxPriceToSell[i]);
        Maxprofit = MaxPriceToSell[0]-MinPriceToBuy[0];
        for(int i=1;i<size;i++){
            int current_profit = MaxPriceToSell[i] - MinPriceToBuy[i];
            Maxprofit = Math.max(Maxprofit,current_profit);
        }
        System.out.println(Maxprofit);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        Profit(prices);
    }
}