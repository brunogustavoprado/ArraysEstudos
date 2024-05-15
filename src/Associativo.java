import java.util.HashMap;

public class Associativo {
    public static void main(String[] args) {

        HashMap<String, Integer> listaDeCompras = new HashMap<>();

        listaDeCompras.put("Peixe", 5);
        listaDeCompras.put("Frango", 15);
        listaDeCompras.put("Bisteca", 25);


        // Iterar sobre as chaves e valores do HashMap usando um loop for-each
        for (String item : listaDeCompras.keySet()) {
            int quantidade = listaDeCompras.get(item);
            System.out.println("Item: " + item + ", Quantidade: " + quantidade);
        }

        System.out.println(listaDeCompras.get("Peixe"));
    }
}
