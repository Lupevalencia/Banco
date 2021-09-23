
package mx.com.gm.banco.domain;

//DE ESTA CUENTA NO SE PUEDE SACAR MÁS DINERO DEL QUE HAY
public class CuentaCC extends Cuentas{

    
    public CuentaCC() {
    }

    public CuentaCC(String dni, float saldo) {
        super(dni, saldo);
        this.intereses =(float) 0.1 ;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{intereses = ").append(intereses);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
     
    
}
