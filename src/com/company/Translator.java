package com.company;

import java.util.ArrayList;

public class Translator {
    String fileDansk = "Language_dansk.txt";
    String fileEngelsk = "Language_english.txt";
    String language;
    ArrayList<String> txts = new ArrayList<String>(17);

    public Translator(String _language){
        this.language = _language;

        getLanguage(language);
    }

    private void getLanguage(String language){ // FIXME: 25-10-2019 Will get info on how to do dis on Monday

    }
}
