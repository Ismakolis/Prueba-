package BancoPrueba;
//Programador:Ismael Anrrango
//Fecha:11/11/2024
//Revision:No
//Detalle:
//importo la libreria Scanner para ingresar datos
import java.sql.SQLOutput;
import java.util.Scanner;
public class Cuenta {
 //definimoslos atributos de la clase
     protected float saldo=0;
     protected int numeroConsignaciones=0;
     protected int numeroRetiros=0;
     protected float tasaAnual=0;
     protected float comicionMensual=0;
// CONSTRUCTOR INICIALIZANDO LOS DOS VALORES SOLICITADOS
    //SALDO Y TASA ANUAL
    public Cuenta(float saldo , float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
//Variable del Scanner
    Scanner sc=new Scanner(System.in);

public void depositar(float nuevoSaldo){
    System.out.println("Ingrese el valor a depositar");
    nuevoSaldo=sc.nextFloat();
    saldo=saldo+nuevoSaldo;

    System.out.println("El valor de la cuenta es: "+saldo);

}

public void retirar( float valorretirar){
    System.out.println("Ingrese el valor a retirar");
    valorretirar=sc.nextFloat();
    saldo=saldo-valorretirar;
    if(valorretirar>saldo){
        System.out.println("Salgo insuficiente: "+saldo);

    }else{
        saldo=saldo-valorretirar;
        System.out.println("Salgo suficiente: "+saldo);
    }
}
public void calculoInteres(){
    //Calculo del interes mensual
    System.out.println("Ingrese el valor a interes Anual");
    tasaAnual=sc.nextFloat();
    tasaAnual=tasaAnual/12;
    //actualizar el saldo
    saldo=saldo+tasaAnual;

}
public void extractoMensual(){
    System.out.println("saldo acutal: "+saldo);

    saldo= saldo-comicionMensual+tasaAnual;

}

public void imprimir(){
    System.out.println("saldo acutal: "+saldo);
    System.out.println("numero de consignaciones: "+numeroConsignaciones);
    System.out.println("numero de retiros: "+numeroRetiros);
    System.out.println("tasa anual: "+tasaAnual);
    System.out.println("comicion mensual: "+comicionMensual);


}

}


