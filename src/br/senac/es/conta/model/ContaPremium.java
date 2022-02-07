package br.senac.es.conta.model;

import br.senac.es.conta.interfaces.AcoesPremium;

public class ContaPremium extends ContaEspecial implements AcoesPremium {
    Double emprestimo;

    @Override
    public void realizarEmprestimo() throws Exception {
        emprestimo = super.limite * 12; //limite = 1 emprestimo = 12
        emprestimo *= emprestimo * 0.3; // 12 + (12 * 0.3) = 12 + 3,75
        if(emprestimo <= 0)
            throw new Exception("Empréstimo não pode ser menor ou igual a zero.");
    }
}
