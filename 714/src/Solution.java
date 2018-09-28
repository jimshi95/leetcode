class Solution {
    public static int maxProfit(int[] prices, int fee) {
        return profit(prices,fee,0,0,false);

    }
    public static int profit(int[] prices, int fee, int current, int day,boolean hold){//a depth first solution
        int curSell,curBuy,curProfit;
        curSell=current+prices[day]-fee;//calculate profit for sale or buy only generate fee when sell
        curBuy=current-prices[day];
        if(hold) {
            curProfit = curSell;
        }
        else{
            curProfit=curBuy;
        }
        if(day==prices.length-1) {//if reaches end return higher value
            if(hold)
                return current+prices[day]-fee;
            else
                return current;
        }
        else {
            day++;
            return Math.max(profit(prices, fee, curProfit, day, !hold), profit(prices, fee, current, day, hold));
        }//a recursive call


        }

        public static void main(String [] args){
        System.out.println(maxProfit(new int[]{1,3,2,8,4,9},2));

        }
    }
