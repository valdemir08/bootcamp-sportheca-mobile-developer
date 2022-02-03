package one.digitalonnovation;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>();

        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("terceiro");
        fila.enqueue("quarto");

        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println(fila);

        fila.enqueue("ultimo");

        System.out.println(fila);
        System.out.println(fila.first());
        System.out.println(fila);

    }
}
