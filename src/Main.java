import practica1.Variable;
import practica1.Ejerciciio;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main mainInstance = new Main();
        Variable var = new Variable();
        Ejerciciio ej = new Ejerciciio();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome! \n");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

            System.out.println("i = " + i);

        }

        int a =10, b=10;
        int si = mainInstance.suma(a,b);
        System.out.println(si);
        System.out.println(var.Variable());

        System.out.print("Clase 2 \n");
        System.out.print(var.aritmetica());
        System.out.print("\n");
        System.out.print("Ejercicio Practico \n");
        ej.ej1();

    }

    public int suma(Integer a, Integer b){
        int c;
        c = a + b;
        return c;
    }
}