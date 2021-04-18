import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterSummation implements AdvancedSumCalculator{
    private int sum=0;
    @Override
    public void calculateSumInteger(String filename) {
    }

    @Override
    public void calculateSumCharacter(String filename) {
        try{
            File file = new File("src/input/"+filename+".txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String[] data=fileReader.nextLine().split("\\s+");
                for( String c : data) {
                    sum = sum+ (int) c.charAt(0);
                }
            }
            fileReader.close();
        }catch(FileNotFoundException e){
            System.out.println("Your file is not present in the input folder");
        }
        System.out.println("Sum of character(ascii value) from "+filename+".txt : "+sum);
    }
}
