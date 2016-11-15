package com.company;

/**
 * Created by User on 15.11.2016.
 */
public class TestStatic {
    private int notStatic;
    public static int staticField;

    public TestStatic(int notStatic, int abc) {
        this.notStatic = notStatic;
        staticField = abc;
    }

    public TestStatic() {
    }

    public int getNotStatic() {
        return notStatic;
    }

    public void setNotStatic(int notStatic) {
        this.notStatic = notStatic;
    }

    public static int getStaticField() {
        return staticField;
    }

    public static void setStaticField(int staticField) {
        TestStatic.staticField = staticField;
    }
}
