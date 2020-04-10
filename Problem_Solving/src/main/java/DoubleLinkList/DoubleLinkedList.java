package DoubleLinkList;

public class DoubleLinkedList {
    public int length = 0;
    DLLNode head;
    DLLNode tail;

    public DoubleLinkedList(){
        //head = new DLLNode(Integer.MIN_VALUE,null,null);
        //tail = new DLLNode(Integer.MIN_VALUE,null,null);
        //head.setNext(tail);
        length = 0;
    }
    public synchronized int getHead(){return head.getData();}

    public synchronized int getTail(){return tail.getData();}

    //Insert at begin
    public synchronized void insertAtBegin(DLLNode node){
        if(node == null)
            return;
        if(head == null)
        {
            node.setNext(null);
            node.setPrev(null);
            head = node;
        }
        else
        {
            node.setNext(head);
            node.setPrev(null);
            head.setPrev(node);
            head = node;
        }
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
            head.setPrev(newNode);
            head=newNode;
            }
//        else if(position == length){
//            DLLNode newNode = new DLLNode(data,null,null);
//            insertAtEnd(newNode);
//        }
        else {
            DLLNode temp = head;
            for (int i = 1; i <= position; i++){
                temp = temp.getNext();
                //System.out.println(temp.getData());
                }
            DLLNode newNode = new DLLNode(data,null,null);
            newNode.setPrev(temp.getPrev());
            newNode.setNext(temp);
            temp.setPrev(newNode);
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

    //Remove element from given position
   /* public synchronized void removeMatched(int data){
        if (head == null) { return; }
        if (data == head.getData()){head=head.getNext();}
        //if (node.equals(tail)){tail=tail.getPrev();}
        else{
            DLLNode temp = head.getNext();
            DLLNode q;
            while (temp != null){

                if (temp.getData() == data){
                    q=temp.getPrev();
                    System.out.println("print"+(temp.getPrev()).getData());
                    DLLNode next=temp.getNext();
                    q.setNext(next);
                    next.setPrev(q);
                    temp=null;
                    length --;
                    return;
                }
                temp=temp.getNext();
        }
        length --;
    }}*/
    public synchronized void removeMatched(DLLNode node){
        if (head == null) { return; }
        if (node.getData() == head.getData()){
            head=head.getNext();
            head.setPrev(null);
            System.out.println("First node deleted");
            }
        if (node.getData() == tail.getData()){
            tail=tail.getPrev();
            tail.setNext(null);
            //System.out.println("Last node deleted");
            }

        DLLNode temp = head.getNext();
        int count = 1;
        while (temp != null){

            if (temp.getData() == node.getData()){
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                System.out.println("Node deleted on position:" + count);
            }
            temp=temp.getNext();
            count++;
        }
        length --;
    }

    //Remove element by position
    public synchronized void removeByPosiiton(int position){
        if (position < 0 ){
            position = 1;
        }
        if (position >= length ){
            position = length;
        }
        if (head==null){
            return;
        }
        if (position == 1){
            head = head.getNext();
            head.setPrev(null);
        }
        else{
            DLLNode temp = head,prev=null,next=null;
            for ( int i=1;i < position;i++){
                temp=temp.getNext();
            }
            prev=temp.getPrev();
            next=temp.getNext();
            prev.setNext(next);
            next.setPrev(prev);
        }
        length--;
    }

    //Match the first given node and tell position
    public synchronized int matchAtPosition(int data){
        int position=0;
        //System.out.println(getHead());
        DLLNode temp = head;
        for (int i = 0 ; i < length ; i++){
            if (temp.getData() == data){
                position=i;
                return position;
            }
            else{temp=temp.getNext();}
        }
        return -1;
    }


    //Print DLL into string representation
    public synchronized String toString(){
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
