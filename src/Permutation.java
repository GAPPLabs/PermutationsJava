import java.util.*;

public class Permutation {
    //Se usan métodos estáticos porque no se considera necesario crear una instancia de Permutation para iterar
    //Su implementación es genérica para que pueda ser usado con cualqueir tipo de listas
    //Su utilidad es similar al framework Collections, por lo que se sigue la misma organización

    //Método que se llama para comenzar las permutaciones
    public static <T extends Comparable<? super T>> ArrayList<Stack<T>> permute(ArrayList<T> originalList) {
        //Se inicializan los arreglos necesarios para el almacenamiento y manipulación de las permutaciones
        LinkedList<T> linkedList = new LinkedList<>((ArrayList<T>) originalList.clone());
        Stack<T> stack = new Stack<>(); //La pila se usa para almacenar la permutación actual de manera temporal
        ArrayList<Stack<T>> permutations = new ArrayList<>();//Se usa para almacenar todas las permutaciones
        //Se llama al método que emplea la recursividad para generar las permutaciones
        permute(stack, linkedList, permutations);
        //Retorna el arreglo con todas las permutaciones almacenadas
        return (ArrayList<Stack<T>>) permutations.clone();
    }

    //Se define como privado para evitar que pueda ser alteerado el resultado de las permutaciones o sufrir problemas de ejecución
    private static <T extends Comparable<? super T>> void permute(Stack<T> stack, LinkedList<T> linkedList, ArrayList<Stack<T>> permutations) {
        for (int i = 0; i < linkedList.size(); i++) {
            stack.add(linkedList.remove(i)); //Almacena el elemento correspondiente a la pila
            permute(stack, linkedList, permutations);
            //La única razón de usar LinkedList y Stack es para poder usar el método addFirst() y pop()
            linkedList.addFirst(stack.pop());
        }
        //En caso de que ya no hayan más elementos para realizar la recursividad, se almacena la nueva permutación que guarda la pila
        if (linkedList.isEmpty()) {
            permutations.add((Stack<T>) stack.clone());
        }
    }
}
