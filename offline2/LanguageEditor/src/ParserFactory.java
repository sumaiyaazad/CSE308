import Interface.Aesthetics;
import Interface.Implementation.C;
import Interface.Implementation.CPP;
import Interface.Implementation.Python;
import Interface.Parser;

public class ParserFactory extends AbstractFactory {
    @Override
    Aesthetics getAesthetics(String type) {
        return null;
    }

    @Override
    Parser getParser(String language) {
        if (language.equalsIgnoreCase("python")) {
            return new Python();
        } else if (language.equalsIgnoreCase("cpp")) {
            return new CPP();
        } else {
            return new C();
        }
    }
}
