package Package;

import java.nio.charset.StandardCharsets;

// This Main class belongs to the Package package.
public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("test");
        System.out.println(textBox1.text.codePoints());

    }

}
