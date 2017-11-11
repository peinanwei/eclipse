package com.test.eclipse;

/**
 * Hello world!
 */
public class App {
    private String string;
    private Integer i;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        Exception exception = new Exception();
        new Exception();
        exception = new Exception();
        Integer in = 0;
        App a = new App();
        a.getString();

    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }
}
