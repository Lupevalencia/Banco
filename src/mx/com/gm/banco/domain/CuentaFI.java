
package mx.com.gm.banco.domain;

//DE ESTA CUENTA SE PUEDEN SACAR HASTA 500 EUROS EN NÚMEROS ROJOS. SI SE SUPERA SE BLOQUEA
public class CuentaFI extends Cuentas{
    private float interesesFI;

    public CuentaFI() {
        
    }

    public CuentaFI(String dni, float saldo) {
        super(dni, saldo);
        this.interesesFI = (float) 0.34;
    }

    public float getInteresesFI() {
        return this.interesesFI;
    }

    public void setInteresesFI(float interesesFI) {
        this.interesesFI = interesesFI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaFI{interesesFI=").append(interesesFI);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
