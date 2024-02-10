package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedContainer <String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("abc");
        stringLinked.addFirst("bnv");
        stringLinked.addFirst("a");
        stringLinked.addFirst("v");
        stringLinked.addFirst("df");
        stringLinked.addLast("kvn");

        for (String s: stringLinked) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
    }
}
