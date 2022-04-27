public class calculate {
    private int[] splittedTip = {0, 0, 0, 0, 0, 0, 0};
    /**
     *
     * @param serviceArray the amount that each individual service costs
     * @param fullTip the total tip the customer had placed
     *
     *
     */
    public calculate(double[] serviceArray, double fullTip){
        int serviceTotal = getTotal(serviceArray);
        for(int i = 0; i < 6; i++){
            if(serviceArray[i] != 0){
                // Get percentage
                double percentage = serviceArray[i] / serviceTotal;
                // Calculate tip by multiplying percentage with total of the tip
                double calculatedTip = percentage * serviceArray[i];
                splittedTip[i] = (int) calculatedTip;
            }
        }
    }

    /**
     *
     * @return the splitted tip array
     */
    public int[] getSplittedTip(){
        return splittedTip;
    }

    /**
     *
     * @param serviceArray the amount of each service
     * @return the total of the array
     */
    private static int getTotal(double[] serviceArray){
        int total = 0;
        for(int i = 0; i < 6; i++){
            total += serviceArray[i];
        }
        return total;
    }
}
