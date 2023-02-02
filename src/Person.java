public class Person implements Comparable<Person>{
    String nombre;
    int edad;

    public Person(String nombre, int edad) {
//        super(edad);
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Person o) {
        return this.edad - o.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
