public class SummationOperation implements SumCalculator{
    SumCalculatorAdapter sumAdapter;
    @Override
    public void calculateSum(String inputType, String filename) {
        if(inputType.equalsIgnoreCase("integer") || inputType.equalsIgnoreCase("integer")){
            sumAdapter = new SumCalculatorAdapter(inputType);
        }else {
            System.out.println("Input format not supported.");
        }
    }
}
