import java.io.Serializable;

public class Information implements Serializable {
    private String element;

    public Information(String element) {
        this.element = element;
    }

    public String getElement() {
        return this.element;
    }
}