package com.company;

public class Field {
    public String txt;
    public String name;
    public int val;
    public boolean extra;

    //Constructor
    public Field(String _txt, int _val, boolean _extra){
        this.txt = _txt;
        this.name = _txt.split(":")[0];
        this.val = _val;
        this.extra = _extra;
    }

}
