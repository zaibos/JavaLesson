package main.java.LinkListProblems;

import main.java.LinkList.LinkedList;
import main.java.LinkList.ListNode;

public class LLPalindrome {

    public void palindrome(LinkedList linkedList){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        LinkedList OriginalLinkList = new LinkedList();
        OriginalLinkList.insertAtBegin(node1);
        OriginalLinkList.insertAtEnd(node2);
        OriginalLinkList.insertAtEnd(node3);
        OriginalLinkList.insertAtEnd(node4);
        OriginalLinkList.insertAtEnd(node5);


        ListNode current = linkedList.getHead();
        ListNode next;
        ListNode prevNode=null;

        while ( current != null){
            next = current.getNext();
            current.setNext(prevNode);
            prevNode=current;
            current=next;
        }

        linkedList.head=prevNode;

        System.out.println("reverse LinkList-> "+linkedList.toString());
        Boolean flag=Boolean.FALSE;
        ListNode headOfOriginal = OriginalLinkList.getHead();
        ListNode headOfReverse = linkedList.head;
        while (headOfOriginal != null && headOfReverse != null){
            if (headOfOriginal.getData() == headOfReverse.getData()){
                headOfOriginal=headOfOriginal.getNext();
                headOfReverse=headOfReverse.getNext();
                flag=Boolean.TRUE;
            }
            else{
                flag=Boolean.FALSE;
                System.out.println("Palindrome Staus-> "+ flag);
                return;
            }
        }
        System.out.println("Palindrome Staus-> "+ flag);

    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        LinkedList obj1 = new LinkedList();
        obj1.insertAtBegin(node1);
        obj1.insertAtEnd(node2);
        obj1.insertAtEnd(node3);
        obj1.insertAtEnd(node4);
        obj1.insertAtEnd(node5);
        System.out.println(obj1.ListLength());
        System.out.println("Head= "+obj1.getHead().getData());
        System.out.println("Original LinkList-> "+obj1.toString());
        LLPalindrome obj2 = new LLPalindrome();
        obj2.palindrome(obj1);
    }
}
