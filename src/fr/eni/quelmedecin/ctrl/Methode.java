package fr.eni.quelmedecin.ctrl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Methode {
    public static String premiereEnMajuscule(String prenom){
        String[] a = prenom.split("[' -]");
        for (int i = 0; i < a.length; i++) {
            String string = a[i];
            a[i] = string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
        }
        return Arrays.toString(a);
    }


    public static String formatNumeroTelephone2(String numTel){
        numTel.toCharArray();
        String f = "Numéro de téléphone invalide" + " " + numTel;
        if(!numTel.contains(".")){
            return f;
        }
        String[] splitNumTel = numTel.split(".");
        if(splitNumTel.length < 5){
            return f;
        }
        return numTel;
    }

    public static String formatNumeroTelephone(String numTel){
        String[] numTela = numTel.split(".*");
        System.out.println(Arrays.toString(numTela));
        String f = "Numéro de téléphone invalide" + " " + numTel;
        if(!numTel.contains(".")){
            return f;
        }
        String[] splitNumTel = numTel.split(".");
        if(splitNumTel.length < 5){
            return f;
        }
        return numTel;
    }

    public static Methode getMethode() {
        return new Methode();
    }
}
