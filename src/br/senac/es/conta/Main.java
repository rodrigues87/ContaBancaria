package br.senac.es.conta;

import br.senac.es.conta.model.ContaEspecial;
import br.senac.es.conta.model.ContaPadrao;
import br.senac.es.conta.model.ContaPremium;

import javax.swing.*;

public class Main {
    public static void main1(String[] args) {

        Boolean executa = true;
        String temp;

        Object[] opcoes = new Object[4];
        opcoes[0] = "Conta Padrão";
        opcoes[1] = "Conta Especial";
        opcoes[2] = "Conta Premium";
        opcoes[3] = "Sair";

        while (executa == true) {

            Integer opcaoEscolhida = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[3]);

            if (opcaoEscolhida == 0) {
                //instanciar um objeto ContaPadrao
                //interagir com o usuário

            } else if (opcaoEscolhida == 1) {
                //instanciar um objeto ContaEspecial
                //interagir com o usuário

            } else if (opcaoEscolhida == 2) {
                //instanciar um objeto ContaPremium
                //interagir com o usuário

            } else if (opcaoEscolhida == 3) {
                executa = false;
            } else {
                executa = false;
            }

            ContaPremium cpr = new ContaPremium();


        }


    }

}
