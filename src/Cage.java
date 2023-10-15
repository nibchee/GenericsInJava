
/*
So remedy to 3rd Problem is to use & , this is only for those animals which eat
 */
public class Cage<E extends Animal & Eat> {
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

    /*
    3.Here is the problem though Animal Monkey eats & we want to feed him
    but its geerating compile time issues
    so we want aniamls in Cage if they only Eats otherwise they would be died
     */
    public void feedAnimals(){
        a1.eat();
    }
}
