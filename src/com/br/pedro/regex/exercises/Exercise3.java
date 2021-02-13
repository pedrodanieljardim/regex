package com.br.pedro.regex.exercises;

public class Exercise3 {

    public void executeRegex(){
//        Matcher matcher = Pattern.compile("[/casa/]", Pattern.CASE_INSENSITIVE).matcher(text);

        String text = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,c,C c!?23e@";
        String regex = "[/C/c/]";
        String replacement = "aba";

        System.out.println(text.replaceAll(regex,replacement));

    }

}
