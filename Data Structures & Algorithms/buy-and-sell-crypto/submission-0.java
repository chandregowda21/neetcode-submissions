class Solution {
    public int maxProfit(int[] prices) {
        int buyp=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<prices.length;i++){
            if(buyp<prices[i]){
                int profit=prices[i]-buyp;
                maxpro=Math.max(maxpro,profit);
            }
            else{
                buyp=prices[i];
            }


        }
        return maxpro;
    }

}
