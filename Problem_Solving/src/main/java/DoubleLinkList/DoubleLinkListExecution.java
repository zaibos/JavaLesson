package DoubleLinkList;

public class DoubleLinkListExecution {
    public static void main(String[] args){
        DLLNode node1 = new DLLNode(1);
        DLLNode node2 = new DLLNode(2);
        DLLNode node3 = new DLLNode(0);
        DLLNode node4 = new DLLNode(4);
        //DLLNode node3 = new DLLNode(5);
        DoubleLinkedList obj1 = new DoubleLinkedList();
        obj1.insertAtBegin(node1);
        obj1.insertAtEnd(node2);
        obj1.insertAtBegin(node3);
        obj1.insertAtEnd(node4);
        obj1.insertAtPosition(5,2);
        //System.out.println(obj1.length);
        //System.out.println(obj1.removeFromEnd());
        System.out.println("lenght= "+obj1.length);
        System.out.println("head= "+obj1.getHead());
        System.out.println("tail= "+obj1.getTail());
        System.out.println(obj1.toString());
    }
}
