import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Editor editor;
        System.out.println("Select parser language for editor: ");
        String language=s.nextLine();
        editor=new Editor(language);
        editor.executeParsing();
    }
}
