public class SummationOperation implements SumCalculator{
    SumCalculatorAdapter sumAdapter;
    @Override
    public void calculateSum(String inputType, String filename) {
        if(inputType.equalsIgnoreCase("integer") || inputType.equalsIgnoreCase("character")){
            sumAdapter = new SumCalculatorAdapter(inputType);
            sumAdapter.calculateSum(inputType, filename);
        }else {
            System.out.println("Input format not supported.");
        }
    }
}
