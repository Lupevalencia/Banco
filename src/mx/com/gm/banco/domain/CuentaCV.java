
package mx.com.gm.banco.domain;

//DE ESTA CUENTA NO SE PUEDE SACAR DINERO Y LA REVISIÓN MENSUAL NO PAGA COMISIÓN BANCARIA
public class CuentaCV extends Cuentas {
    private float interesesCV;

    public CuentaCV() {
    }

    public CuentaCV(String dni, float saldo) {
        super(dni, saldo);
        this.interesesCV = (float) 0.2;
    }
    

    public float getInteresesCV() {
        return this.interesesCV;
    }

    public void setInteresesCV(float interesesCV) {
        this.interesesCV = interesesCV;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaCV{interesesCV=").append(interesesCV);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
