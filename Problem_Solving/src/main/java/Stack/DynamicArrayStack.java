package Stack;

public class DynamicArrayStack {
    public int stackSize;
    public int[] ArrStack;
    public int top;

    public DynamicArrayStack(int size){
        this.stackSize=size;
        this.ArrStack=new int[stackSize];
        this.top=-1;
    }

    public int peek(){
        return top+1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isStackFull(){
        return (top == stackSize -1);
    }

    public void push(int data){
        if (this.isStackFull()){
            expandArrStack();
        }
        ArrStack[top+1]=data;
        System.out.println("Data inserted in stack->"+data);
        top=top+1;
    }

    public void pop() {
        if (this.isEmpty()){
            System.out.println("empty stack");
        }
        //ArrStack[top]=0;
        System.out.println("Poped 1 element from top->"+ArrStack[top]);
        top=top-1;
        stackSize=stackSize-1;
    }

    public void expandArrStack(){
        int[] newArray = new int[stackSize *2];
        for ( int i=0;i<stackSize;i++){
            ArrStack[i]=newArray[i];
        }
        this.ArrStack=newArray;
        this.stackSize=stackSize*2;
    }

    public static void main(String[] args){
        DynamicArrayStack obj = new DynamicArrayStack(3);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.push(4);
        obj.push(5);
        System.out.println(obj.stackSize);
    }
}
