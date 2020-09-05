package main.java.LinkListProblems;
import main.java.CircularLinkList.*;
public class DetectCircularLinkList {
    public CLLNode head;
    Object obj;
    public DetectCircularLinkList(CircularLinkedList obj,CLLNode head){
        this.obj=obj;
        this.head=head;
    }

    public int DetectLoop(){
        CLLNode slow=head; CLLNode fast=head;
        while(slow !=null && fast !=null && fast.getNext() != null){
            slow=slow.getNext(); fast=fast.getNext().getNext();
            if (slow == fast){
                System.out.println("Loop Detected");
                return 1;
            }
        }
        System.out.println("Loop Not Detected");
        return 0;
    }


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
        DetectCircularLinkList obj1 = new DetectCircularLinkList(obj,obj.getTail());
        obj1.DetectLoop();
    }
}
