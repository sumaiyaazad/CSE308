import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Editor editor;
        System.out.println("Select parser language for editor: ");
        String type=s.nextLine();
        editor=new Editor(type);
        System.out.println("Do you want to select style for editor?");
        type=s.nextLine();
        if(type.equalsIgnoreCase("y") || type.equalsIgnoreCase("yes")){
            System.out.println("Style : ");
            type=s.nextLine();
            editor.setStyle(type);
        }
        else{
            editor.setStyle("Normal");
        }
        System.out.println("Do you want to select color for editor?");
        type=s.nextLine();
        if(type.equalsIgnoreCase("y") || type.equalsIgnoreCase("yes")){
            System.out.println("Color : ");
            type=s.nextLine();
            editor.setStyle(type);
        }
        else{
            editor.setColor("Blue");
        }
        System.out.println("Do you want to execute parsing?");
        type=s.nextLine();
        if(type.equalsIgnoreCase("y") || type.equalsIgnoreCase("yes")){
            System.out.println("filename : ");
            type=s.nextLine();
            editor.setStyle(type);
            editor.executeParsing(type);
        }
    }
}
