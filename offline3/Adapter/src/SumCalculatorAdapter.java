public class SumCalculatorAdapter implements  SumCalculator{
    AdvancedSumCalculator summationCalculator;

    public SumCalculatorAdapter(String inputType) {
        if(inputType.equalsIgnoreCase("integer")){
            summationCalculator = new IntegerSummation();
        }else if(inputType.equalsIgnoreCase("integer")){
            summationCalculator = new CharacterSummation();
        }
    }

    @Override
    public void calculateSum(String inputType, String filename) {
        if(inputType.equalsIgnoreCase("integer")){
            summationCalculator.calculateSumInteger(filename);
        }else if(inputType.equalsIgnoreCase("integer")){
            summationCalculator.calculateSumCharacter();
        }
    }
}
