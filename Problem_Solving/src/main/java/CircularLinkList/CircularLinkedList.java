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
            //System.out.println("Node inserted at peek");
        }
        else{
            CLLNode temp = tail;
            for (int i=1; i<length;i++){
                temp=temp.getNext();
            }
            node.setNext(tail);
            tail=node;
            temp.setNext(tail);
            //System.out.println("Node inserted at peek");
        }
        length++;
    }

    //Insert node at end
    public synchronized void insertAtEnd(CLLNode node){
        if (tail==null){
            tail=node;
            tail.setNext(tail);
            //System.out.println("Node inserted at peek");
        }
        else{
            CLLNode temp = tail;
            for (int i=1; i<length;i++){
                    temp=temp.getNext();
                }
            temp.setNext(node);
            node.setNext(tail);
            //System.out.println("Node Inserted at end");
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
            CLLNode temp = tail;
            for (int i=1;i < position;i++){
                temp=temp.getNext();
            }
            CLLNode newNode = new CLLNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            length++;
        }
    }

    //Remove from End
    public synchronized void removeFromEnd(){
        if (tail == null){return;}
        else{
            CLLNode temp = tail;
            for(int i=1;i<length-1;i++){
                temp=temp.getNext();
            }
            temp.setNext(tail);
        }
        length--;
    }

    //Remove from peek
    public synchronized void removeFromPeek(){
        if (tail == null){return;}
        else{
            CLLNode temp = tail;
            for(int i=1;i<length;i++){
                temp=temp.getNext();
            }
            temp.setNext(tail.getNext());
            tail=tail.getNext();
        }
    length--;
    }

    //Remove from position
    public synchronized void removeMatched(int data){
        if (tail.getData() == data){removeFromPeek();}
        else{
            CLLNode temp = tail; CLLNode temp2 = tail.getNext();
            for(int i=1;i<length;i++){
                if(temp2.getData() == data){
                    temp.setNext(temp2.getNext());
                }
                temp2=temp2.getNext();
                temp=temp.getNext();
            }
            length--;
        }
    }

    //Represent collection in String
    public String toString(){
        String result = "[";
        if (tail == null){
            return result+"]";
        }
        result = result+tail.getData();
        CLLNode temp = tail.getNext();
        while (temp != tail){
            result=result+","+temp.getData();
            temp=temp.getNext();
        }
        return result+"]";
    }
}
