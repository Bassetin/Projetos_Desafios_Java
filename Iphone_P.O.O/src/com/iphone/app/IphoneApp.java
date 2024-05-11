package com.iphone.app;

import com.iphone.chamadas.AparelhoTelefonico;
import com.iphone.internet.NavegadorInternet;
import com.iphone.ipod.ReprodutorMusical;

public class IphoneApp implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

        public static void main(String [] args){

            System.out.println("INICIANDO APARELHO.");
            ligar();
            atender();
            iniciarCorreioVoz();
            adicionarNovaAba();
            exibirPagina();
            atualizarPagina();
            tocarMusica();
            pausarMusica();
            selecionarMusica();



        }



    static void ligar() {

            System.out.println("LIGANDO PARA ALGUEM");

    }


    static void atender() {

        System.out.println("ATENDENDO LIGAÇÃO");

    }


    static void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }


    static void adicionarNovaAba() {

        System.out.println("ADICIONANDO NOVA ABA AO NAVEGADOR DE INTERNET");

    }


    static void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA DA INTERNET");
    }


    static void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA DA INTERNET");

    }


    static void tocarMusica() {

        System.out.println("TOCANDO MUSICA..");

    }


    static void pausarMusica() {
        System.out.println("PAUSANDO A MUSICA..");

    }


    static void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA..");
    }
}