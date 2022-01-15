public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0; i<accounts.length;i++){
            int accWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                accWealth = accWealth + accounts[i][j];
            }
            if(wealth < accWealth){ // OR, max = Math.max(accWealth, wealth);
                wealth = accWealth;
            }
        }
        return wealth;
    }
}

/*
1. Using Java 8 Streams:-

    return Arrays.stream(accounts)
                .mapToInt(customerAccount -> Arrays.stream(customerAccount).sum())
                .max()
                .getAsInt();
                
*/