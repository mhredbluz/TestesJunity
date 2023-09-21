public class Conta {

    private double saldo;
    private boolean ativo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(this.ativo) {
            this.saldo += valor;
        }
    }
    public void sacar(double valor) {
        if(this.ativo) {
            this.saldo -= valor;
        }
    }
    public boolean isAtivo() {
        return ativo;
    }

    public void ativar(boolean ativo) {
        this.ativo = true;
    }
    public void inativar(boolean ativo) {
        this.ativo = false;
    }
}
