import Interface.Aesthetics;
import Interface.Parser;

public class Editor {
    private AestheticsFactory aFactory = new AestheticsFactory();
    private ParserFactory pFactory = new ParserFactory();
    private Parser parser;
    private Aesthetics fontAesthetics=  aFactory.getAesthetics("font");
    private Aesthetics colorAesthetics= aFactory.getAesthetics("color");
    private Aesthetics styleAesthetics= aFactory.getAesthetics("style");

    Editor(String language){
        if(language.equalsIgnoreCase("python")){
            parser=pFactory.getParser("python");
            fontAesthetics.setAesthetics("Consolas");
        }
        else if(language.equalsIgnoreCase("cpp")){
            parser=pFactory.getParser("cpp");
            fontAesthetics.setAesthetics("Monaco");
        }
        else{
            parser=pFactory.getParser("c");
            fontAesthetics.setAesthetics("Courier New");
        }
    }
    public void executeParsing(String filename){
        parser.parseLanguage(filename,fontAesthetics.getAestheticsValue(),colorAesthetics.getAestheticsValue(), styleAesthetics.getAestheticsValue());
    }
    public void setStyle(String type){
        styleAesthetics.setAesthetics(type);
    }
    public void setColor(String type){
        colorAesthetics.setAesthetics(type);
    }
}
