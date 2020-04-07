package LinkList;

import java.util.List;

public class LinkedList {
    private int length = 0;
    ListNode head;
    public LinkedList(){
        length = 0;
    }
    //Insert Node at Beginning
    public synchronized void insertAtBegin(ListNode node){
        node.setNext(head);
        head = node;
        length ++;
    }

    //Get first node of the link
    public synchronized ListNode getHead(){
        return head;
    }

    //Insert Node at the End
    public synchronized void insertAtEnd(ListNode node){
        if ( head == null ){
            head = node;
        }
        else{
            ListNode p,q;
            for ( p=head;(q=p.getNext()) != null; p=q ){}

            p.setNext(node);
        }
        length++;
    }

    //Insert Node at given position
    public synchronized void insertAtPosition(int data, int position){
        if (position < 0){position=0;}
        if (position > length){position = length;}
        if (head == null){head = new ListNode(data);}
        else if(position == 0){
            ListNode temp = new ListNode(data);
            temp.next = head;
            head = temp;
        }
        else{
            ListNode temp = head;
            for (int i=1;i<position;i+=1){
                temp=temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.setNext(newNode);
        }
        length++;
    }

    //Remove and Return the node at the head of the list
    public synchronized ListNode removeFromBegin(){
        ListNode node = head;
        if (node != null){
            head=node.getNext();
            node.setNext(null);
        }
        length --;
        return node;
        }
     //Remove and Return the node at the end of the list
    public synchronized ListNode removeFromEnd(){
        if (head == null){return null;}
        if (head.getNext() == null){head.setNext(null);return head;}
        ListNode p = head; ListNode q = null; ListNode next = head.getNext();
        while ( (next = p.getNext()) != null){
            q = p;
            p = next;
        }
        q.setNext(null);
        length --;
        return p;
    }

    //Remove the node matching the specified node from the list
    public synchronized void removeMatched(ListNode node) {
        if (head == null) {
            return;
        }
        if (node.equals(head)) {
            head = head.getNext();
            return;
        }
        ListNode p = head;
        ListNode q = null;
        while ((q = p.getNext()) != null) {
            if (node.equals(q)) {
                p.setNext(q.getNext());
                return;
            }
            p = q;
        }
        length --;
    }

    //Remove the value at the given position
    public synchronized void remove(int position){
        if (position < 0){
            position = 0;
        }
        if (position >= length) {
            position = length -1;
        }
        if (head == null){
            return;
        }
        if (position == 0){
            head = head.getNext();
        }
        else{
            ListNode temp = head;
            for (int i=1;i<position;i++){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        length -=1;
        }
    public int ListLength(){
        return length;}

    //Position of first value that is equal to given value
    public int getPosition(int data){
        ListNode node = head;
        int count =0;
        while(node != null ){
           if (node.getData() == data) {
               return count;
               }
               count += 1;
               node = node.getNext();
            }
        return Integer.MIN_VALUE;
        }
    //Convert to link list into string
    public String toString(){
        String result = "[";
        if (head == null){
            return result+"]";
        }
        result = result+head.getData();
        ListNode temp = head.getNext();
        while (temp != null){
            result=result+","+temp.getData();
            temp=temp.getNext();
        }
        return result+"]";
    }
    //Element at position
    public int getPositionOfEle(int data){
        int count =0;
        for (int i=0; i<length; i++){
            if (head.getData() == data){
                count=i;
            }
            else{head=head.getNext();count=i;}
        }return count;
    }
}
