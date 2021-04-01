public class CharacterSummation implements AdvancedSumCalculator{
    @Override
    public void calculateSumInteger(String filename) {
    }

    @Override
    public void calculateSumCharacter(String filename) {
        System.out.println("Sum of character(ascii value) ... filename: "+filename);
    }
}
