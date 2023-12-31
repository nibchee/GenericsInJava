public class Zoo {
    public static void main(String[] args) {
        /*
        As here Cage created with Object class due to which able to have 2 different anmals
        in same cage but wants smae
         so generic is used
         */
        Cage<Monkey> c1 = new Cage<>(new Monkey(), new Monkey());
//        Cage<Lion> c2 = new Cage<>(new Lion(), new Lion());

     /*
    1.Now here Cage can accept string type objects as well which is not an animal,
    hence this is issue
    */
        // Cage<String> c3 = new Cage<>("monkey", "Cat");

    /*
    TO handle above issue we declare Cage class to be more restrictive i.e Cage<E extends Animal>
     Now it would only accepts Animals
     */

        /*
        2. Now issue is we want to print the Animals so pass the Generic Cage objects in function
        but function does not accepts Parent class, it works specific to particular Animal only
         */
        //Not Possible
        printAnimalInCage(c1);
        // printAnimalInCage(c2);
        /*
        remedy is just use wildcard character ? in function
         */


    }

    /*
    Problem 4 now we are able to print the animal in cage & able to get it  but not able to
    set the animal to different monkey
    This is known as UpperBound Wildcard
     */

    public static void printAnimalInCage(Cage<? extends Monkey> c) {
        System.out.println(c.getA1().getClass()+" "+ c.getA2().getClass());
        // c.setA1(new Monkey());       //Compile Time Error
    }

    /*
    Remedy is to use lowerbound Wildcards using super
     */
    public static void SetAnimalInCage(Cage<? super Monkey> c) {
        System.out.println(c.getA1().getClass()+" "+ c.getA2().getClass());
        c.setA1(new Monkey());       //Compile Time Error
    }
}