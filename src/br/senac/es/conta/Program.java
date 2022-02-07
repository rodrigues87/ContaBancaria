package br.senac.es.conta;

import br.senac.es.conta.model.ContaPadrao;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        Object[] options = {"Conta Padrao","Conta Especial", "Conta Premium"};
        int n = JOptionPane.showOptionDialog(null,
                "Escolha a opção de conta que deseja abrir",
                "Banco",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                null);

        if(n == 0){
            ContaPadrao cpa = new ContaPadrao();
            int resposta = 0;
            while (resposta >= 0){
                resposta = exibirContaPadrão(cpa);
                if(resposta == 0){
                    String valor = JOptionPane.showInputDialog(null,
                            "Informe o valor de depósito");
                    cpa.depositar(Double.parseDouble(valor));
                }
                if(resposta == 1){
                    String valor = JOptionPane.showInputDialog(null,
                            "Informe o valor de saque");
                    try {
                        cpa.sacar(Double.parseDouble(valor));
                    }catch (Exception e){
                        System.out.println("O valor digitado não é numérico");
                    }
                }
                if(resposta == 2){
                    String[] opcoesConsulta = {"Voltar"};
                    JOptionPane.showOptionDialog(null,
                            "O seu saldo é " + cpa.consultaSaldo(),
                            "Conta Padrão",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.DEFAULT_OPTION,
                            null,
                            opcoesConsulta,
                            null);
                }
            }
        }

    }

    public static int exibirContaPadrão(ContaPadrao cpa){
        int resposta = 0;
        String[] opcoesContaPadrao = {"Depositar", "Sacar", "Consultar saldo"};
        resposta = JOptionPane.showOptionDialog(null,
                "Escolha a opção",
                "Conta Padrão",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.DEFAULT_OPTION,
                null,
                opcoesContaPadrao,
                opcoesContaPadrao[1]);
        return resposta;
    }
}
