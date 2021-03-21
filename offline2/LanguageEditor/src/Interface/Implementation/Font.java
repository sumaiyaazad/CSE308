package Interface.Implementation;

import Interface.Aesthetics;

public class Font implements Aesthetics {
    private String font;
    @Override
    public void setAesthetics(String type) {
        font=type;
        System.out.println("Font Setter: "+font);
    }

    @Override
    public String getAestheticsValue() {
        return font;
    }
}
