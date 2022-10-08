package com.example.lab2;

import android.widget.Toast;

public class TextCounter {
    public static int getCharsCount(String text){
        return text.length();
    }

    public static int getWordsCount (String text){
        return text.split("\\P{Alnum}+").length;
    }
}
