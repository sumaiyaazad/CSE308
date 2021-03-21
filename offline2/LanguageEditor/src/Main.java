import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Editor editor;
        for(int i=0;;i++) {
            System.out.println("filename : ");
            String filename = s.nextLine();
            if (filename.contains("py")) {
                editor = new Editor("python");
            } else if (filename.contains("cpp")) {
                editor = new Editor("cpp");
            } else {
                editor = new Editor("c");
            }
            System.out.println("Do you want to select style for editor?");
            String type = s.nextLine();
            if (type.equalsIgnoreCase("y") || type.equalsIgnoreCase("yes")) {
                System.out.println("Style : ");
                type = s.nextLine();
                editor.setStyle(type);
            } else {
                editor.setStyle("Normal");
            }
            System.out.println("Do you want to select color for editor?");
            type = s.nextLine();
            if (type.equalsIgnoreCase("y") || type.equalsIgnoreCase("yes")) {
                System.out.println("Color : ");
                type = s.nextLine();
                editor.setColor(type);
            } else {
                editor.setColor("Blue");
            }
            editor.executeParsing(filename);
        }
    }
}
