package main.java.DoubleLinkList;

public class DLLNode {
    public int data;
    public DLLNode prev;
    public DLLNode next;

    public DLLNode (int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public DLLNode (int data, DLLNode prev, DLLNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setPrev(DLLNode node){
        this.prev=node;
    }

    public DLLNode getPrev(){
        return prev;
    }

    public void setNext(DLLNode node){
        this.next=node;
    }

    public DLLNode getNext(){
        return next;
    }


}
