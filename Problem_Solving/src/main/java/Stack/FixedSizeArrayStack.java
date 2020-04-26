package Stack;

public class FixedSizeArrayStack {
    public static final int capacity=10;
    public int[] stack;
    public int top = -1;
    public FixedSizeArrayStack(){
        this.stack = new int[capacity];
    }

    public int size(){
        return (top+1);
    }
    public boolean isEmpty(){
        return (top<0);
    }

    public void push(int data) throws Exception{
        if (size() == capacity){
            throw new Exception("Stack is Full");
        }
        stack[top+1]=data;
        top=top+1;
        System.out.println("inserted->"+data);
    }

    public int top() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        return stack[top];
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        int data;
        data=stack[top];
        top=top-1;
        return data;
    }

    public String toString(){
        String s="[";
        if (size() > 0){
            s=s+stack[0];}
        if (size() > 1){
            for ( int i=1;i < size();i++){
                s=s+","+stack[i];
            }
        }
        return s+"]";
    }

    public static void main(String[] args) throws Exception {
        try {
            FixedSizeArrayStack obj = new FixedSizeArrayStack();
            obj.push(1);
            obj.push(2);
            obj.push(3);
            System.out.println("Current size of stack->"+obj.size());
            System.out.println(obj.toString());
            System.out.println(obj.pop());
            System.out.println("Current size of stack->"+obj.size());
            System.out.println(obj.toString());
        }
        catch (Exception E){
            System.out.println(E.getMessage());
        }
    }
}
