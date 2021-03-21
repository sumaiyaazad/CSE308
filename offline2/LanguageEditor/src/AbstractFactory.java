import Interface.Aesthetics;
import Interface.Parser;

public abstract class AbstractFactory {
    abstract Aesthetics getAesthetics(String type);
    abstract Parser getParser(String language);
}
