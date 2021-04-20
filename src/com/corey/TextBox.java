package com.corey;

public class TextBox extends UIControl{

    public String text= ""; // Field

    // Setter:
    public void setText (String text) {
        this.text = text;
    }

    public void clear () {
        text = "";
    }
}
