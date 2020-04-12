package LinkListProblems;
import LinkList.*;
public class BestCaseSearchLinkList {
    //O(1) scan to find the element from End
    ListNode head;
    Object obj;

    public BestCaseSearchLinkList(LinkedList obj,ListNode head){
        this.obj = obj;
        this.head=head;
    }

    public void GetNthElementFromEnd(int position){
        ListNode p = head; ListNode q=null;
        //System.out.println(p.getData());
        for (int i =1;i<=position;i++){
            p=p.getNext();
            //System.out.println(p.getData());
        }
        q=head;
        while(p!=null){
            p=p.getNext();
            q=q.getNext();
        }
        System.out.println(position+"rd element from End is->"+q.getData());
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        LinkedList obj = new LinkedList();
        obj.insertAtBegin(node);
        obj.insertAtEnd(node1);
        obj.insertAtEnd(node2);
        obj.insertAtEnd(node3);
        obj.insertAtEnd(node4);
        obj.insertAtEnd(node5);

        BestCaseSearchLinkList obj2 = new BestCaseSearchLinkList(obj,obj.getHead());
        obj2.GetNthElementFromEnd(3);
    }
}
