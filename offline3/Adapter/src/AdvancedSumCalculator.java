import java.io.FileNotFoundException;

public interface AdvancedSumCalculator {
    public void calculateSumInteger(String filename) throws FileNotFoundException;
    public void calculateSumCharacter(String filename);
}
