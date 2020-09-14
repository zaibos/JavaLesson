package main.java.CircularLinkList;

public class CurcularLinkListExecution {
    public static void main(String[] args){
        CLLNode node1 = new CLLNode(1);
        CLLNode node2 = new CLLNode(2);
        CLLNode node3 = new CLLNode(3);
        CLLNode node4 = new CLLNode(4);
        CircularLinkedList obj = new CircularLinkedList();
        obj.insertATPeek(node1);
        obj.insertAtEnd(node2);
        obj.insertATPeek(node3);
        obj.insertAtEnd(node4);
        obj.insertAtPosition(5,4);
        obj.removeFromPeek();
        obj.removeFromEnd();
        obj.removeMatched(1);
        System.out.println("Tail->"+obj.getTail().getData());
        System.out.println("print length of CLL= "+obj.length);
        System.out.println("printing CLL->"+obj.toString());
    }
}
