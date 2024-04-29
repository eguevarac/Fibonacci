import java.util.ArrayList;

public class Fibonacci {

    private static ArrayList<Integer> fibonacci;


    public static void main(String[] args) {

        inicialitzarFibo();

        for (int i = 0; i < 5; i++) {
            Calculador cal = new Calculador("C"+(i+1), fibonacci);
            cal.start();
        }
    }

    private static void inicialitzarFibo(){
        fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
    }
}