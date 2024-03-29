package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Translator {
    String language;
    ArrayList<String> txts = new ArrayList<String>();

    public Translator(String _language) throws IOException {
        this.language = _language;
        getLanguage(this.language);
    }

    private void getLanguage(String language) throws IOException {
        String file ="Languages/Language_" + language.toLowerCase() + ".txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null) {
            this.txts.add(line);
        }
        reader.close();
    }
}
