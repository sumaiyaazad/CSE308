import java.io.FileNotFoundException;

public class SumCalculatorAdapter implements  SumCalculator{
    AdvancedSumCalculator summationCalculator;

    public SumCalculatorAdapter(String inputType) {
        if(inputType.equalsIgnoreCase("integer")){
            summationCalculator = new IntegerSummation();
        }else if(inputType.equalsIgnoreCase("character")){
            summationCalculator = new CharacterSummation();
        }
    }

    @Override
    public void calculateSum(String inputType, String filename) throws FileNotFoundException {
        if(inputType.equalsIgnoreCase("integer")){
            summationCalculator.calculateSumInteger(filename);
        }else if(inputType.equalsIgnoreCase("character")){
            summationCalculator.calculateSumCharacter(filename);
        }
    }
}
