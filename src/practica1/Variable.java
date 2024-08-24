package practica1;

public class Variable {
    int numero = 0;
    float decimal = 10.3023F;
    double doble = 10.20;
    char letra = 'A';
    String palabra = "Hola";
    boolean bandera = true;
    long extenso = 1233443534;

    public String Variable() {
        return "Hola desde la variable clase";
    }

    public int aritmetica(){
        int n1, n2, total;

        n1= 2; n2=2;
        total = n1 + n2;

        return total;
    }
}
