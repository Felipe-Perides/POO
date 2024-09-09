package exerciciosGiHub;

public class ContaPoupanca extends ContaBancaria {
    protected double diaRendimento;
    
    public ContaPoupanca(String NomeCliente, int NumConta, double Saldo, double DiaRendimento) {
        super(NomeCliente, NumConta, Saldo);
        this.diaRendimento = DiaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void sacar(double quantRetirar) {
        if (quantRetirar <= saldo) {
            setSaldo(getSaldo() - quantRetirar);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void calcularNovoSaldo() {
        double porcent = (this.saldo * diaRendimento) / 100;
        setSaldo(saldo + porcent);
    }
}
