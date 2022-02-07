package br.senac.es.conta.model;

public class ContaEspecial extends ContaBasica {

    public ContaEspecial() {
        super.limite = 0.0;
        super.saldo = 0.0;
    }

    @Override
    public void depositar(Double valor) {
        super.saldo += valor;
    }

    @Override
    public void sacar(Double valor) throws Exception {
        if ((saldo + limite) - valor >= 0) {
            super.saldo -= valor;
        } else {
            throw new Exception(valor + " excede o limite disponível que é " + super.saldo + super.limite);
        }
    }

    @Override
    public Double consultaSaldo() {
        return super.saldo;
    }

    public void definirLimite(Double valor) throws Exception {
        if (valor < 0) {
            throw new Exception("O valor não pode ser negativo ");
        }
        super.limite = valor;
    }

    public Double consultaLimite() {
        return super.limite;
    }


}
