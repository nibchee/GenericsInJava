public class Cage<E extends Animal> {
    E a1;
    E a2;

    public Cage(E a1, E a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public E getA1() {
        return a1;
    }

    public void setA1(E a1) {
        this.a1 = a1;
    }

    public E getA2() {
        return a2;
    }

    public void setA2(E a2) {
        this.a2 = a2;
    }
}
