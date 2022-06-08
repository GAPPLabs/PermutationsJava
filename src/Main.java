import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Creando arreglo de prueba para probar Permutation
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(5);
//        integerArrayList.add(6);
//        integerArrayList.add(7);
//        integerArrayList.add(8);
//        integerArrayList.add(9);
//        integerArrayList.add(10);
//        integerArrayList.add(11);
        //Uso de clase propia para poder evaluar las permutaciones de los objetos
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Juan", 22));
        personArrayList.add(new Person("Pablo", 19));
        personArrayList.add(new Person("Tasha", 23));
        //Se necesita un arreglo del tipo del argumento para poder almacenar la lista
        ArrayList<Stack<Integer>> permutaciones = Permutation.permute(integerArrayList);
        System.out.println("CANTIDAD DE PERMUTACIONES: " + permutaciones.size());
        //Ciclo para imprimir las permutaciones almacenadas en el arreglo permutaciones
//        for (Stack<Integer> pila : permutaciones) {
//            for (Integer dato : pila) {
//                System.out.print(dato.toString() + " ");
//            }
//            System.out.println();
//        }
    }

}
