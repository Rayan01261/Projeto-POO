
package projeto;

/**
 *
 * @author Rayan
 */
public class Conta  {
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(float valor){
        saldo += valor;
    }
    public void saque(float valor){
        saldo -= valor;
    }
    
}
