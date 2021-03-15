package Package;

public class TextBox {

    public String text = ""; // Field

    // Setter:
    public void setText (String text) {
        this.text = text;
    }
    // Getter
    public String getText() {
        return text;
    }

    public void clear () {
        text = "";// Don't need the .this keyword here
    }


}
