package com.br.pedro.regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {

    public void exercise(){
        String text = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,";
        Pattern patternWord = Pattern.compile("[a-f]");
        Matcher matcher = patternWord.matcher(text);

        while(matcher.find()){
            System.out.printf("Posições %s ,%s - Valor : %s \n", matcher.start(), matcher.end(), matcher.group());
        }

        System.out.println(text.replaceAll("[7-9]","Achei"));
    }
}
