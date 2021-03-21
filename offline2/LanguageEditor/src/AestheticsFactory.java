import Interface.Aesthetics;
import Interface.Implementation.Color;
import Interface.Implementation.Font;
import Interface.Implementation.Style;
import Interface.Parser;

public class AestheticsFactory extends AbstractFactory {
    @Override
    Aesthetics getAesthetics(String type) {
        if (type.equalsIgnoreCase("font")) {
            return new Font();
        } else if (type.equalsIgnoreCase("color")) {
            return new Color();
        } else {
            return new Style();
        }
    }

    @Override
    Parser getParser(String language) {
        return null;
    }
}
