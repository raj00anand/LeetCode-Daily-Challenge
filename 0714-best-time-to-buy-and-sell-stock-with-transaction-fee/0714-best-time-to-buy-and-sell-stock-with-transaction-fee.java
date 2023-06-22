class Solution {
    public int maxProfit(int[] prices, int fee) {
        int obp=-prices[0],osp=0;
        for(int i=0;i<prices.length;i++){
            int nsp=0;
            int nbp=0;
            if(osp-prices[i]>obp){
                nbp=osp-prices[i];
            }else{
                nbp=obp;
            }
            if(obp+prices[i]-fee>osp){
                nsp=obp+prices[i]-fee;
            }else{
                nsp=osp;
            }
            osp=nsp;
            obp=nbp;
        }
        return osp;
    }
}