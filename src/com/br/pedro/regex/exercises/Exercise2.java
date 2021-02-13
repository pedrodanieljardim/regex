package com.br.pedro.regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {

    public void executeRegex(){
//        Matcher matcher = Pattern.compile("[/casa/]", Pattern.CASE_INSENSITIVE).matcher(text);

        String text = "Casa amarela, casa azul, casa verde g i";
        String regex = "[casa]";
        String replacement = "C";

        System.out.println(text.replaceAll(regex,replacement));

    }

}
