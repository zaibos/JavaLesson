package main.java.LinkListProblems;

import main.java.CircularLinkList.CLLNode;
import main.java.CircularLinkList.CircularLinkedList;

import static java.lang.Math.abs;
import static java.lang.Math.round;


public class divideCLLInTwoCLL {

    public void divide(CircularLinkedList circularLinkedList){
        double len = circularLinkedList.length;
        System.out.println("lenth-> "+len);
        CLLNode tailTemp1 = circularLinkedList.getTail();
        CLLNode temp = circularLinkedList.getTail();
        //CLLNode tail1 = null;
        double halfDecimal = len/2;
        double half = round(halfDecimal);
        int halfValue = ((int) half);
        System.out.println("half"+halfValue);
        for (int i =0;i<halfValue;i++){
            temp = temp.getNext();
        }
        CLLNode temp2=temp.getNext();
        CLLNode tailFirst = tailTemp1.getNext();
        temp.setNext(tailFirst);
        CLLNode nextCLL=temp.getNext();
        String result1="["+nextCLL.getData();
        CLLNode tail1=temp;
        while(nextCLL != tail1){
            result1=result1+","+nextCLL.getNext().getData();
            tail1=tail1.getNext();
        }
        System.out.println(result1+"]");

        tailTemp1.setNext(temp2);
        System.out.println(circularLinkedList.toString());

        }

    public static void main(String[] args) {
        CLLNode node1 = new CLLNode(1);
        CLLNode node2 = new CLLNode(2);
        CLLNode node3 = new CLLNode(7);
        CLLNode node4 = new CLLNode(4);
        CLLNode node5 = new CLLNode(5);
        CLLNode node6 = new CLLNode(6);
        CLLNode node7 = new CLLNode(8);
        CircularLinkedList obj = new CircularLinkedList();
        obj.insertATPeek(node1);
        obj.insertAtEnd(node2);
        obj.insertAtEnd(node3);
        obj.insertAtEnd(node4);
        obj.insertAtEnd(node5);
        obj.insertAtEnd(node6);
        obj.insertAtEnd(node7);
        System.out.println(obj.toString());
        divideCLLInTwoCLL obj1 = new divideCLLInTwoCLL();
        obj1.divide(obj);
    }
}
