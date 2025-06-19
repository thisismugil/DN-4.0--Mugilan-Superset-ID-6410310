public class FinancialForecast {
    static double predictFutureVal(double intamt, double growthFactor, int timePeriod) {
        if (timePeriod == 0) {
            return intamt;
        }
        return predictFutureVal(intamt, growthFactor, timePeriod - 1) * (1 + growthFactor);
    }
    public static void main(String[] args) {
        double startVal1 = 6000.0; 
        double growthRate1 = 0.10;      
        int years1 = 13;                
        double startVal2 = 9000.0; 
        double growthRate2 = 0.15;      
        int years2 = 8;           

        System.out.println("Financial Forecasting Results:");
        double futureValue1 = predictFutureVal(startVal1, growthRate1, years1);
        System.out.printf("Initial: $%.2f, Growth Rate: %.2f%%, Years: %d, Future Value: $%.2f%n",
                startVal1, growthRate1 * 100, years1, futureValue1);
        double futureValue2 = predictFutureVal(startVal2, growthRate2, years2);
        System.out.printf("Initial: $%.2f, Growth Rate: %.2f%%, Years: %d, Future Value: $%.2f%n",
                startVal2, growthRate2 * 100, years2, futureValue2);

        System.out.println("\nAnalysis:");
        System.out.println("1)Recursion Explanation:");
        System.out.println("Recursion is when a method calls itself to solve a smaller problem");
        System.out.println("PredictFutureValue(n) calculates the value for n years by using the value for (n-1) years and also apply the growth rate");
        System.out.println("When timePeriod is 0 return intamt.");
        System.out.println("This will finalise as compound growth formula is FV=PV*(1 + r)^n");
        System.out.println("2)Time Complexity:");
        System.out.println("The recursive method makes one call per time period so the time complexity is O(n) then n is the number of periods");
        System.out.println("Space complexity is O(n) due to the recursive call stack");
    }
}