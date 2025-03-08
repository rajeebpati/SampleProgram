package samples;

public class ReverceLinkedListImpl {


    public static void main(String[] args) {
        Node node = new Node(4, null);
        node.next = new Node(5, null);
        node.next.next = new Node(9,null);
        node.next.next.next = new Node(2,null);

        printNode(node);
        System.out.println("After reverse: ");

        printNode(reverseList(node));
    }

    private static void printNode(Node node) {
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static Node reverseList(Node node) {
        Node prev = null;
        Node currentNode = node;

        while (currentNode!=null) {
            Node next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }

        node = prev;
        return node;
    }

}


 class Node {
     int data;
     Node next;

     public Node(int data, Node node) {
         this.data = data;
         this.next = node;
     }
 }