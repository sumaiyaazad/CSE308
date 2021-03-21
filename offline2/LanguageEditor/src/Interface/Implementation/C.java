package Interface.Implementation;

import Interface.Parser;

public class C implements Parser {
    @Override
    public void parseLanguage(String Filename, String Font, String Color, String Style) {
        System.out.println("Parsing C Language("+Font+" font, "+Color+" color, "+Style+" style) : "+Filename);
    }
}
