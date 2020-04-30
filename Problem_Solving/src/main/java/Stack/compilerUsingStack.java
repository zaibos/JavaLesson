package Stack;
import java.util.Stack;

public class compilerUsingStack<ch, a> {

        String s="()()[]";

//    public compilerUsingStack(String str1){
//        this.s=str1;
//    }

    public static void main(String[] args) {
        Stack<String> stacks=new Stack<String>();
        compilerUsingStack obj = new compilerUsingStack();

        String[] a = obj.s.split("");
        for (String ch : a) {
            if (ch.equals(")")){
                if(!stacks.empty() && (stacks.peek()).equals("(")){
                    stacks.pop();
                    System.out.println("poped->"+ch);
                }
                else{
                    return;
                }
            }
            else if(ch.equals("]")){
                if(!stacks.empty() && (stacks.peek()).equals("[")){
                    stacks.pop();
                    System.out.println("poped->"+ch);
                }
                else{
                    return;
                }
            }
            else if(ch.equals("}")){
                if(!stacks.empty() && ch.equals("{")){
                    stacks.pop();
                    System.out.println("poped->"+ch);
                }
                else{
                    return;
                }
            }
            else{
                stacks.push(ch);
                System.out.println("pushed->"+ch);
                }
        }
        System.out.println(stacks.toString());
    }
}
