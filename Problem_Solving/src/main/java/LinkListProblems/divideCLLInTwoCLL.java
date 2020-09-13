package main.java.LinkListProblems;

import main.java.CircularLinkList.CLLNode;
import main.java.CircularLinkList.CircularLinkedList;

public class divideCLLInTwoCLL {

    public void divide(CircularLinkedList circularLinkedList){
        int len = circularLinkedList.length;
        CLLNode tailTemp1 = circularLinkedList.getTail();
        CLLNode temp = null;
        int half = len/2;
        if(len % 2 == 0){
            for (int i =0;i<half;i++){
                temp = tailTemp1.getNext();
            }
            CLLNode temp2=tailTemp1;
            temp.setNext(tailTemp1);
            tailTemp1.setNext(temp2);
        }
        else{
            for(int i =0;i<=half+1;i++){
                temp = tailTemp1.getNext();
            }
            CLLNode temp2=temp.getNext();
            temp.setNext(tailTemp1);
            tailTemp1.setNext(temp2);
            }
        System.out.println(circularLinkedList.toString());
        }

    public static void main(String[] args) {
        CLLNode node1 = new CLLNode(1);
        CLLNode node2 = new CLLNode(2);
        CLLNode node3 = new CLLNode(3);
        CLLNode node4 = new CLLNode(4);
        CircularLinkedList obj = new CircularLinkedList();
        obj.insertATPeek(node1);
        obj.insertAtEnd(node2);
        obj.insertAtEnd(node3);
        obj.insertAtEnd(node4);
        System.out.println(obj.toString());
        divideCLLInTwoCLL obj1 = new divideCLLInTwoCLL();
        obj1.divide(obj);
    }
}
