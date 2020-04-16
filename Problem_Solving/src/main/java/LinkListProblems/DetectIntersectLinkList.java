package LinkListProblems;
import LinkList.*;

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
        ListNode t1=head1,t2=head2;
        while(t1 != null){System.out.print(t1.getData());t1= t1.getNext();length1++;}
        System.out.print("******next link******");
        while(t2 != null){System.out.print(t2.getData());t2= t2.getNext();length2++;}
    }
    //Detect intersecting node
    public void DetectIntersectingNode(){
        System.out.println();
        if ((length1 - length2) == 0){
            while (head1 != null && head2 != null ){
                if (head1 == head2){
                    System.out.println("Intersecting Node is->"+head1.getData());
                    return;
                }
                head1=head1.getNext();
                head2=head2.getNext();
            }
        }
        else{
            int diff_length = length1-length2;
            if (diff_length > 0){
                for ( int i=0;i<diff_length;i++){
                    head1=head1.getNext();
                }
            }
            else{
                diff_length=Math.abs(diff_length);
                for ( int i=0;i<diff_length;i++){
                    head2=head2.getNext();
                }
            }
            while (head1 != null && head2 != null ){
                if (head1 == head2){
                    System.out.println("Intersecting Node is->"+head1.getData());
                    return;
                }
                head1=head1.getNext();
                head2=head2.getNext();
            }
        }
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        LinkedList Obj = new LinkedList();
        LinkedList Obj1 = new LinkedList();
        Obj.insertAtBegin(node);
        Obj.insertAtEnd(node1);
        Obj.insertAtEnd(node2);
        Obj1.insertAtBegin(node3);
        Obj1.insertAtEnd(node4);
        Obj1.insertAtEnd(node5);
        DetectIntersectLinkList O = new DetectIntersectLinkList(Obj,Obj1);
        O.Create_Intersect_LinkedList();
        O.DetectIntersectingNode();
    }
}
