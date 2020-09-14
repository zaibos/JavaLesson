package main.java.CircularLinkList;

public class CircularLinkedList {
    public int length;
    public CLLNode tail;
    public CircularLinkedList(){length = 0;}
    //get tail
    public CLLNode getTail(){return tail;}
    //Insert at peek
    public synchronized void insertATPeek(CLLNode node){
        if (tail == null){
            tail=node;
            tail.setNext(tail);
            System.out.println("Node inserted at peek"+tail.getData());
        }
        else{
            CLLNode temp = tail.getNext();
//            for (int i=1; i<length;i++){
//                temp=temp.getNext();
//            }
            node.setNext(temp);
            tail.setNext(node);
            System.out.println("Node inserted at peek"+tail.getData());
        }
        length++;
    }

    //Insert node at end
    public synchronized void insertAtEnd(CLLNode node){
        if (tail==null){
            tail=node;
            tail.setNext(tail);
            System.out.println("Node inserted at end"+tail.getData());
        }
        else{
            CLLNode temp = tail.getNext();
            CLLNode temp2 = tail.getNext();
            for (int i=1; i<length;i++){
                    temp=temp.getNext();
                }
//            temp.setNext(node);
////            node.setNext(tail.getNext());
            tail.setNext(node);
            tail=node;
            tail.setNext(temp2);
            System.out.println("Node Inserted at end"+tail.getData());
            }
        length++;
        }

    //Insert at position
    public synchronized void insertAtPosition(int data,int position){

         if (position < 0 ){position = 0;}
         if (position >= length){position = length;}
        if (tail == null){
            CLLNode newNode = new CLLNode(data);
            tail=newNode;
            tail.setNext(tail);
            length++;
        }
        else if (position == 0){
            CLLNode newNode = new CLLNode(data);
            insertATPeek(newNode);
        }
        else{
            CLLNode temp = tail.getNext();
            for (int i=1;i < position;i++){
                temp=temp.getNext();
            }
            CLLNode newNode = new CLLNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            if (temp==tail){
                tail=newNode;
            }
            length++;
        }
    }

    //Remove from End
    public synchronized void removeFromEnd(){
        if (tail == null){return;}
        else{
            CLLNode temp = tail;
            for(int i=1;i<length;i++){
                temp=temp.getNext();
            }
            CLLNode firstNode = tail.getNext();
            temp.setNext(firstNode);
            tail=temp;
        }
        length--;
    }

    //Remove from peek
    public synchronized void removeFromPeek(){
        if (tail == null){return;}
        else{
            //CLLNode temp = tail;
            CLLNode second=tail.getNext().getNext();
            tail.setNext(second);
        }
    length--;
    }

    //Remove from position
    public synchronized void removeMatched(int data){
        if (tail.getData() == data){removeFromEnd();}
        else{
            CLLNode temp = tail;
            CLLNode firstNode = tail.getNext();
            for(int i=0;i<length-1;i++){
                if(firstNode.getData() == data ){
                    temp.setNext(firstNode.getNext());
                    length--;
                    return;
                }
                firstNode=firstNode.getNext();
                temp=temp.getNext();
            }
        }
    }

    //Represent collection in String
    public String toString(){
        String result = "[";
        if (tail == null){
            return result+"]";
        }
        result = result+tail.getNext().getData();
        CLLNode temp = tail.getNext();
        while (temp != tail){
            result=result+","+temp.getNext().getData();
            temp=temp.getNext();
        }
        return result+"]";
    }
}
