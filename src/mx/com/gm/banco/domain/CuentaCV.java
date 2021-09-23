
package mx.com.gm.banco.domain;

//DE ESTA CUENTA NO SE PUEDE SACAR DINERO Y LA REVISIÓN MENSUAL NO PAGA COMISIÓN BANCARIA
public class CuentaCV extends Cuentas {

    public CuentaCV() {
    }

    public CuentaCV(String dni, float saldo) {
        super(dni, saldo);
        this.intereses = (float) 0.2;
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
