import java.util.*;

public class ComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(12, "bruno", 30);
        Animal a2 = new Animal(7, "leo", 14);
        Animal a3 = new Animal(7, "blacky", 8);
        Animal a4 = new Animal(1, "maxx", 6);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);
        System.out.println();
        Collections.sort(dogs);
        System.out.println();
        System.out.println(dogs);
    }

}
