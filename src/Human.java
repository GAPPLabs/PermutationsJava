public class Human implements Comparable<Human> {
    int edad;
    public Human(int edad) {
        this.edad = edad;
    }
    @Override
    public int compareTo(Human o) {
        System.out.println("Entra en  método de Human");
        return this.edad - o.edad;
    }
}
