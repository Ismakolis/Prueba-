package BancoPrueba;

public class CuentaAhorros extends Cuenta{

    protected boolean cuentaActiva;
//constructor
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.cuentaActiva=cuentaActiva;
    }

    //metodods heredaos
    public void depositar() {
        super.depositar(0);
    }

    public void retirar(){
        super.retirar(0);
    }

    public void extractoMensual(){
        super.extractoMensual();
        if(saldo<100){
            System.out.println("La cuenta esta inactiva");
            System.out.println("Comuniquese con un adminitrador del banco para mas información ");
        }else{
            System.out.println("La cuenta esta activa");
            depositar();
            retirar();

        }
    }



}
