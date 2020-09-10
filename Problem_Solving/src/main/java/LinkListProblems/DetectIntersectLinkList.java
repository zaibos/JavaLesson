package main.java.LinkListProblems;
import main.java.LinkList.*;


public class DetectIntersectLinkList {
    ListNode head1;
    ListNode head2;
    Object obj;
    Object obj1;
    int length1=0;
    int length2=0;
    public DetectIntersectLinkList(LinkedList Obj, LinkedList Obj1){
        this.obj=Obj;
        this.obj1=Obj1;
        this.head1 = Obj.getHead();
        this.head2 = Obj1.getHead();
    }

    public void Create_Intersect_LinkedList(){
        ListNode temp=head1;
        for ( int i=1;i<3;i++ ){
            temp = temp.getNext();
        }
        ListNode temp2 = head2;
        while ( temp2.getNext() != null){
            temp2=temp2.getNext();
        }

        temp2.setNext(temp);
        //temp.setNext(null);
        ListNode t1=head1,t2=head2;
        while(t1 != null){System.out.print(t1.getData());t1= t1.getNext();length1++;}
        System.out.print("******next link******");
        while(t2 != null){System.out.print(t2.getData());t2= t2.getNext();length2++;}
    }
    //Detect intersecting node
    public void DetectIntersectingNode(){
        System.out.println();
        ListNode T1 = head1;
        ListNode T2 = head2;
        if ((length1 - length2) == 0){
            while (T1 != null && T2 != null ){
                if (T1 == T2){
                    System.out.println("Intersecting Node is->"+T2.getData());
                    return;
                }
                T1=T1.getNext();
                T2=T2.getNext();
            }
        }
        else{
            int diff_length = length1-length2;
            if (diff_length > 0){
                for ( int i=0;i<diff_length;i++){
                    T1=T1.getNext();
                }
            }
            else{
                diff_length=Math.abs(diff_length);
                for ( int i=0;i<diff_length;i++){
                    T2=T2.getNext();
                }
            }
            while (T1 != null && T2 != null ){
                if (T1 == T2){
                    System.out.println("Intersecting Node is->"+T1.getData());
                    return;
                }
                T1=T1.getNext();
                T2=T2.getNext();
            }
        }
    }

    //Using Stack Detect
    public void detectUsingStack(){

        stackUsingLL stack1 = new stackUsingLL();
        stackUsingLL stack2 = new stackUsingLL();
        ListNode s1=head1;
        ListNode s2=head2;
        ListNode tempo = null;
        System.out.println("****Print Stack1****");
        while(s1 != null) {
            System.out.println(s1.getData());
            ListNode s3 = new ListNode(s1.getData());
            stack1.push(s3);
            s1 = s1.getNext();
        }
        System.out.println("****Print Stack2****");
        while (s2 != null) {
            System.out.println(s2.getData());
            ListNode s3 = new ListNode(s2.getData());
            stack2.push(s3);
            s2=s2.getNext();
        }

        System.out.println("*******Stack2*******");
        System.out.println(stack2.toStr());
        System.out.println(stack2.top.getData());
        System.out.println("*******Stack1*******");
        System.out.println(stack1.toStr());
        System.out.println(stack1.top.getData());


        while(stack1.top != null && stack2.top != null){
            ListNode top1=stack1.top;
            ListNode top2=stack2.top;
//            System.out.println("inside loop");
            for (int i=1;i<stack1.length;i++){
                top1=top1.getNext();
            }

            for (int i=1;i<stack2.length;i++){
                top2=top2.getNext();
            }
            if (top1.getData() == top2.getData()){
                stack1.pop();stack2.pop();
                tempo = top1;
                }
            else{
                System.out.println("intersecting node->"+tempo.getData());
                return;}
            }
        }


    public static void main(String[] args){
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node7 = new ListNode(7);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        LinkedList Obj = new LinkedList();
        LinkedList Obj1 = new LinkedList();
        Obj.insertAtBegin(node);
        Obj.insertAtEnd(node1);
        Obj.insertAtEnd(node2);
        Obj.insertAtEnd(node7);
        Obj1.insertAtBegin(node3);
        Obj1.insertAtEnd(node4);
        Obj1.insertAtEnd(node5);
        DetectIntersectLinkList O = new DetectIntersectLinkList(Obj,Obj1);
        O.Create_Intersect_LinkedList();
        //O.DetectIntersectingNode();
        O.detectUsingStack();
    }
}
