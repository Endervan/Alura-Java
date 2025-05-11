package org.example.data;

public class Data {

    int dia;
    int mes;
    int ano;


    Data() {
        dia = 1;
        mes = 1;
        ano = 2020;
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }


}
