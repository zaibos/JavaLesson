package DoubleLinkList;

public class DoubleLinkedList {
    public int length = 0;
    DLLNode head;
    DLLNode tail;

    public DoubleLinkedList(){
        head = new DLLNode(Integer.MIN_VALUE,null,null);
        tail = new DLLNode(Integer.MIN_VALUE,head,null);
        head.setNext(tail);
        length = 0;
    }
    public synchronized int getHead(){return head.getData();}

    public synchronized int getTail(){return tail.getData();}

    //Insert at begin
    public synchronized void insertAtBegin(DLLNode node){
        head.setPrev(node);
        node.setNext(head);
        node.setPrev(null);
        head=node;

//        if (length == 1){
//            tail=head;
//        }
//        else {
//            DLLNode temp = head;
//            while (temp.getNext() != null){
//                temp=temp.getNext();
//            }
//            tail=head;
//        }
        length ++;
    }

    //Insert at tail
    public synchronized void insertAtEnd(DLLNode node){
        if (head == null){
            head = node;
            node.setPrev(null);
            node.setNext(null);
        }
        else{
            DLLNode temp = head;
            for (int i=1; i < length;i++){
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setPrev(temp);
            node.setNext(null);
            tail=node;
        }
        length ++;
    }

    //Insert element at given position
    public synchronized void insertAtPosition(int data, int position){
        if (position > length){position = length;}
        if (position < 0){position = 0;}

        if (head == null){
            head = new DLLNode(data,null,null);}

        else if(position == 0){
            DLLNode newNode = new DLLNode(data,null,head);
            head.setPrev(newNode);}

        else {
            DLLNode temp = head;
            for (int i = 1; i <= position; i++){
                if (i == position){
                    DLLNode newNode = new DLLNode(data,temp.getPrev(),temp);
                    temp.setPrev(newNode);}
                else{
                temp = temp.getNext();}
            }
        }
        length ++;
        }


    //Remove from Begin and return the node
    public synchronized DLLNode removeFromBegin(){
        DLLNode node = head;
        if ( node != null ){
            node.setNext(null);
            head = node.getNext();
        }
        length --;
        return node;
    }

    //Remove from End and return the node
    public synchronized DLLNode removeFromEnd(){
        DLLNode p = head; DLLNode q=null; DLLNode next=p.getNext();
        if ( head != null ){
            while ((next=p.getNext()) != null){
                q=p;
                p=next;
            }
            tail = q;
            tail.setNext(null);
            //tail.setPrev(p.getPrev());
        }
        length --;
        return p;
    }

    //Print DLL into string representation
    public String toString(){
        String result = "[";
        if (head == null){
            return result+"]";
        }
        result = result+head.getData();
        DLLNode temp = head.getNext();

        while (temp != null){
            result = result+","+temp.getData();
            temp = temp.getNext();
        }
        return result+"]";
    }
}
