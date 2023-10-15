public class Zoo {
    public static void main(String[] args) {
        //As here Cage created with Object class due to which able to have 2 different anmals in same cage but wants smae
        //so generic is used
        Cage<Monkey> c1 = new Cage<>(new Monkey(), new Monkey());
        Cage<Lion> c2 = new Cage<>(new Lion(), new Lion());

     /*
    Now here Cage can accept string type objects as well which is not an animal,
    hence this is issue
    */
        Cage<String> c3 = new Cage<>("monkey", "Cat");
    }
}