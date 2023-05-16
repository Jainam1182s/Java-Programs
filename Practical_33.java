import java.util.LinkedList;

public class Practical_33 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Het");
        list.add("Vasu");
        list.add("Amar");
        list.add("Kartik");
        list.add("Anuja");
        System.out.println("Linked list: " + list);

        list.add(2, "Jainam");
        list.remove(3);
        System.out.println("Updated linked list: " + list);

        String element = list.get(4);
        System.out.println("Element at position 4: " + element);

        int index = list.indexOf("Vasu");
        System.out.println("Index of 'Vasu': " + index);

        boolean contains = list.contains("Kartik");
        System.out.println("Contains 'Kartik': " + contains);

        list.clear();
        System.out.println("Final linked list: " + list);
    }
}