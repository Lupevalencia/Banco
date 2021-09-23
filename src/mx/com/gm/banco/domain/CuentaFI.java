
package mx.com.gm.banco.domain;

//DE ESTA CUENTA SE PUEDEN SACAR HASTA 500 EUROS EN NÚMEROS ROJOS. SI SE SUPERA SE BLOQUEA
public class CuentaFI extends Cuentas{

    public CuentaFI() {
        
    }

    public CuentaFI(String dni, float saldo) {
        super(dni, saldo);
        this.intereses = (float) 0.34;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{intereses=").append(intereses);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
