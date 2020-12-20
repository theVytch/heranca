package entidade;

public final class ContaEmpresa extends Conta{

    private Double limiteEmprestimo;


    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double quantidade){
        if(quantidade <= limiteEmprestimo) {
            saldo += quantidade - 10.0;
        }
    }

    @Override
    public void saque(Double quantidade) {
        super.saque(quantidade);
        saldo -= 2.0;
    }
}
