public class Editor {
    private Parser parser;
    private Aesthetics fontAesthetics=new Font();
    private Aesthetics colorAesthetics=new Color();
    private Aesthetics styleAesthetics=new Style();
    Editor(String language){
//        styleAesthetics.setAesthetics("Normal");
//        colorAesthetics.setAesthetics("Blue");
        if(language.equalsIgnoreCase("python")){
            parser=new Python();
            fontAesthetics.setAesthetics("Consolas");
        }
        else if(language.equalsIgnoreCase("cpp")){
            parser=new CPP();
            fontAesthetics.setAesthetics("Monaco");
        }
        else{
            parser=new C();
            fontAesthetics.setAesthetics("Courier New");
        }
    }
    public void executeParsing(String filename){
        parser.parseLanguage(filename);
    }
    public void setStyle(String type){
        styleAesthetics.setAesthetics(type);
    }
    public void setColor(String type){
        colorAesthetics.setAesthetics(type);
    }
}
