package Interface.Implementation;

import Interface.Aesthetics;

public class Style implements Aesthetics {
    private String style;
    @Override
    public void setAesthetics(String type) {
        style=type;
        System.out.println("Style Setter: "+style);
    }

    @Override
    public String getAestheticsValue() {
        return style;
    }
}
