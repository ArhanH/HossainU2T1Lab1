public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Jason", 10, 50);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Lilah", 5, 25);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
