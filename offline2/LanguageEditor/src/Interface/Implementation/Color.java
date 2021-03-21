package Interface.Implementation;

import Interface.Aesthetics;

public class Color implements Aesthetics {
    private String color;
    @Override
    public void setAesthetics(String type) {
        color=type;
        System.out.println("Color Setter: "+color);
    }

    @Override
    public String getAestheticsValue(){
        return color;
    }
}
