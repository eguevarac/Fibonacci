import java.util.ArrayList;

public class Calculador extends Thread {

    private ArrayList<Integer> fibonacci;

    public Calculador(String nom, ArrayList<Integer> fibonacci) {
        super(nom);
        this.fibonacci = fibonacci;
    }

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 8; i++) {
            synchronized (fibonacci) {
                afegirNumero();
            }
        }
    }

    private void afegirNumero() {
        Integer ultimNum = fibonacci.get(fibonacci.size() - 1);
        //System.out.println("Último número de la lista -> " + ultimNum);
        Integer penultimNum = fibonacci.get(fibonacci.size() - 2);
        //System.out.println("Penúltimo número de la lista -> " + penultimNum);
        Integer resultadoSuma = ultimNum + penultimNum;
        float proporcion = (float) resultadoSuma / ultimNum;
        try {
            sleep(20);
        } catch (InterruptedException e) {
            System.out.println("Error en el sleep");
        }
        fibonacci.add(resultadoSuma);
        //System.out.println(this.getName());
        System.out.println(this.getName() + ": " + resultadoSuma + " (" + proporcion + ")");
    }
}
