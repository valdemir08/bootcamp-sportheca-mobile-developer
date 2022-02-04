package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.add("teste 1");
        listaEncadeada.add("teste 2");
        listaEncadeada.add("teste 3");
        listaEncadeada.add("teste 4");

        System.out.println(listaEncadeada.get(0));
        System.out.println(listaEncadeada.get(1));
        System.out.println(listaEncadeada.get(2));
        System.out.println(listaEncadeada.get(3));

        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.remove(3));
        System.out.println(listaEncadeada);
    }
}
