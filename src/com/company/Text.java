package com.company;

public class Text {
    public void transform(char[] chArray){
        //  char[] chArray = text.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            for (int j = i+1; j < chArray.length-1; j++) {
                if (chArray[i]=='р' && chArray[j]=='а')
                {
                    chArray[j]='о';
                    i++;
                }
                else if(chArray[chArray.length-2]!='р')
                {
                    i++;
                }
            }
        }

    }
}