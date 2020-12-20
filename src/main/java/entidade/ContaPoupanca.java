package entidade;

public final class ContaPoupanca extends Conta {
    private Double taxaDeJuros;

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizacaoSalso(){
        saldo +=  saldo * taxaDeJuros;
    }

    @Override
    public void saque(Double quantidade) {
        saldo -= quantidade;
    }
}
