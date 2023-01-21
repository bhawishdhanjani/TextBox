package com.oppconcept;

public class Main {
    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();
        textBox1.setText("Bhawish Hello I a first TextBox Object");
        System.out.println(textBox1.text);
        var textBox2 = new TextBox();
        textBox2.setText("Bhawish Hello I a second TextBox Object");
        System.out.println(textBox2.text);

    }
}
