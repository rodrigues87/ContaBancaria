package br.senac.es.conta.model;

import br.senac.es.conta.interfaces.AcoesPremium;

public class ContaPremiumReserva extends ContaEspecial implements AcoesPremium {

    Double emprestimo;

    @Override
    public void realizarEmprestimo() throws Exception {
        Double calculo = limite * 12;
        calculo = calculo * 1.30;

        if (calculo <= 0) {
            throw new Exception("Valor Inválido");
        } else {
            emprestimo = calculo;
        }
    }
}
