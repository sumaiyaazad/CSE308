import java.util.Scanner;

public class AdapterPattern {
    public static void main(String[] args) {
        SummationOperation sumop=new SummationOperation();
        Scanner s = new Scanner(System.in);
        for(int i=0;;i++) {
            System.out.println("input type( Integer, Character ) : ");
            String inputType = s.nextLine();
            System.out.println("filename : ");
            String filename = s.nextLine();
            sumop.calculateSum(inputType,filename);
        }
    }
}
