public class Main {
    public static void main(String[] args) {
        Node head = new Node(30);
        head.setNextNode(new Node(50));
        System.out.println((head.getNode()).getData());
        System.out.println("Added new to this file");
    }
}