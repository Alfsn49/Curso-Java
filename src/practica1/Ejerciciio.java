package practica1;

public class Ejerciciio {
    public void ej1(){
        int n1= 35, n2=20, aux;

        System.out.println("Mi valores iniciales: "+ "N1= "+ n1 + "| " + "N2= "+ n2 );

        aux = n2;
        n2 = n1;
        n1 = aux;
        System.out.println("-------Despues------");
        System.out.println("Valores actuales: "+ "N1= "+ n1 + "| " + "N2= "+ n2 );

    }
}
