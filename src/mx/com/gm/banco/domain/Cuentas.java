 
package mx.com.gm.banco.domain;

public class Cuentas {
     String dni;
     float comision;
     float saldo;
     int numeroPuntos; //Se suma un punto por cada 6 euros ingresados
     
     //Constructores

    public Cuentas() {
    }

    public Cuentas(String dni, float saldo) {
        this.dni = dni;
        this.comision = (float) 0.6;
        this.saldo = saldo;
        this.numeroPuntos = numeroPuntos;
    }
    
    //métodos

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getComision() {
        return this.comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroPuntos() {
        return this.numeroPuntos;
    }

    public void setNumeroPuntos(int numeroPuntos) {
        this.numeroPuntos = numeroPuntos;
    }
    
    //toString

    @Override
    public String toString() {
        return "Cuentas{" + "dni=" + dni + ", comision=" + comision + ", saldo=" + saldo + ", numeroPuntos=" + numeroPuntos + '}';
    }


    


}

