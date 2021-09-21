
package mx.com.gm.banco.domain;

//DE ESTA CUENTA NO SE PUEDE SACAR MÁS DINERO DEL QUE HAY
public class CuentaCC extends Cuentas{
    private float interesesCC;

    
    public CuentaCC() {
    }

    public CuentaCC(String dni, float saldo) {
        super(dni, saldo);
        this.interesesCC =(float) 0.1 ;
    }

    
    public float getInteresesCC() {
        return this.interesesCC;
    }

    public void setInteresesCC(float interesesCC) {
        this.interesesCC = interesesCC;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCC{interesesCC = ").append(interesesCC);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
     
    
}
