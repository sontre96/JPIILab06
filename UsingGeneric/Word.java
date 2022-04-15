package com.example4.UsingGeneric;

public class Word {
    private String value;
    private int position;

    public Word(String v, int p){
        value = v;
        position = p;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
