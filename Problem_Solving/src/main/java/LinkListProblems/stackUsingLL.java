package LinkListProblems;
import LinkList.ListNode;

import java.util.List;

public class stackUsingLL {
    public int length;
    public ListNode top;
    public stackUsingLL(){
        this.top=null;
        length=0;
    }

    public synchronized void push(ListNode node){
        if (top == null){top=node;}
        else{
            ListNode temp = top;
            while(temp.getNext() != null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
        length++;
    }
    public synchronized void pop(){
        if (top == null){return;}
        else if(length ==1){top=null;}
        else{
            ListNode temp =top;
            for (int i=1;i < length-1;i++){
                temp=temp.getNext();
            }
            temp.setNext(null);
        }
        length--;
    }

    public String toStr(){
        String result = "[";
        if (top == null){
            return result+"]";
        }
        result = result+top.getData();
        ListNode temp = top.getNext();
        while (temp != null){
            result=result+","+temp.getData();
            temp=temp.getNext();
        }
        return result+"]";
    }

    public static void main(String[] args){
        ListNode newNode = new ListNode(1);
        ListNode newNode2 = new ListNode(2);
        ListNode newNode3 = new ListNode(3);

        stackUsingLL obj = new stackUsingLL();
        obj.push(newNode);

        obj.push(newNode2);
        obj.push(newNode3);
        obj.pop();
        System.out.println("Length of stack= "+obj.length);
        System.out.println(obj.toStr());
        System.out.println(obj.top.getData());
    }
}
