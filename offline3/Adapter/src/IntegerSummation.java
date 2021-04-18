import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Scanner;

public class IntegerSummation implements AdvancedSumCalculator{
    private int sum=0;
    @Override
    public void calculateSumInteger(String filename) throws FileNotFoundException {
        try{
            File file = new File("src/input/"+filename+".txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String[] data=fileReader.nextLine().split("\\s+");
                for( String num : data) {
                    sum = sum+Integer.parseInt(num);
                }
            }
            fileReader.close();
        }catch(FileNotFoundException e){
            System.out.println("Your file is not present in the input folder");
        }
        System.out.println("Sum of integers from "+filename+".txt : "+sum);
    }

    @Override
    public void calculateSumCharacter(String filename) {

    }
}
