package main.java.LinkList;

import main.java.LinkList.*;

public class LinkListEcecution {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        //ListNode node3 = new ListNode(5);
        LinkedList obj1 = new LinkedList();
        obj1.insertAtBegin(node1);
        obj1.insertAtEnd(node2);
        obj1.insertAtPosition(5,1);
        //obj1.removeFromEnd();
        System.out.println(obj1.ListLength());
        obj1.removeMatched(node1);
        System.out.println("Head= "+obj1.getHead());
        System.out.println(obj1.toString());
        System.out.println(obj1.getPositionOfEle(5));
    }
}
