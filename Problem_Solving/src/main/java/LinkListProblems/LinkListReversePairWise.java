package main.java.LinkListProblems;

import main.java.LinkList.LinkedList;
import main.java.LinkList.ListNode;

public class LinkListReversePairWise {

    public void reversePair(LinkedList linkedList){
        ListNode head1 = linkedList.getHead();
        while(head1 != null && head1.getNext() != null){

            int temp = head1.getData();
            int temp2 = head1.getNext().getData();
            head1.setData(temp2);
            ListNode aux = head1.getNext();
            aux.setData(temp);
            if(head1.getNext().getNext() != null) {
                head1 = head1.getNext().getNext();
                //System.out.println(head1.getData());
                }
            else{
                head1=null;
            }
        }
        System.out.println(linkedList.toString());
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        //ListNode node4 = new ListNode(4);
        LinkedList obj = new LinkedList();
        obj.insertAtBegin(node1);
        obj.insertAtEnd(node2);
        obj.insertAtEnd(node3);
        //obj.insertAtEnd(node4);
        System.out.println(obj.toString());
        System.out.println("Initial Head"+obj.getHead().getData());
        LinkListReversePairWise obj1 = new LinkListReversePairWise();
        obj1.reversePair(obj);

    }
}
