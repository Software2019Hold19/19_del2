package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Translator {
    String fileDansk = "Language_dansk.txt";
    String fileEngelsk = "Language_english.txt";
    String language;
    ArrayList<String> txts = new ArrayList<String>(18);

    public Translator(String _language){
        this.language = _language;

        getLanguage(language);
    }

    private void getLanguage(String language) throws IOException { // FIXME: 25-10-2019 Will get info on how to do dis on Monday
        String file ="minFil.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
