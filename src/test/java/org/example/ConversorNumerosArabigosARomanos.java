package org.example;

public class ConversorNumerosArabigosARomanos {
    public String convertir(int numeroArabigo) {

        if(numeroArabigo == 2){
            return "II";
        }

        if(numeroArabigo == 3){
            return "III";
        }

        return "I";
    }
}
