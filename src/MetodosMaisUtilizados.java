import java.util.Arrays;

public class MetodosMaisUtilizados {
    public static void main(String[] args) {
        //CONSEGUIR  TAMANHO DOS DOS QUANTIDADE
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(array.length);

        //COPIAR DADOS DE ARRAYS
        int[] arrayOriginal = {1,2,3};
        int[] arrayCopia = Arrays.copyOf(arrayOriginal, 2);

        //PREENCHER TODOS OS CAMPOS DA ARRAY COM UM ELEMENTO ESPECIFICO
        int[] arrayComTodos = new int[5];
        Arrays.fill(arrayComTodos, 12); // Todas terão o mesmo valor
        System.out.println(arrayComTodos[2]);

        //ORGANIZADOR DE ARRAY DO MENOR PARA O MAIOR
        int[] arrayOrganizado = {5,3,1,2,4};
        Arrays.sort(arrayOrganizado); //IRÁ FICAR 1 2 3 4 5

        //CONVERTER UMA ARRAY PARA STRING
        int[] arrayString = {1,2,3,4,5};
        String StringArray = Arrays.toString(arrayString);
        System.out.println(StringArray);

        //COMPARA DOIS ARRAYS PARA IGUALDADE
        int[] arrayExemplo1 = {1,2,3};
        int[] arrayExemplo2 = {1,2,3};
        boolean iguais = Arrays.equals(arrayExemplo1, arrayExemplo2); //VAI RETORNAR TRUE SE FOREM IGUAIS E FALSE SE NÃO FOREM
        System.out.println(iguais);

    }
}
