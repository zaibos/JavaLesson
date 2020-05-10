package main.java.Stack;

import java.util.Stack;

public class infixToPost {
    public static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostfix(String exp){
        String result = new String("");
        Stack<Character> stack = new Stack<Character>();

        for(int i =0; i < exp.length(); i++){
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
                result += c;
            }
            else if(c=='('){
                stack.push(c);
                //System.out.println(stack.toString());
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek() != '(' ){
                    result += stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() != '('){
                    return "Invalid Expression";
                }
                else{
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && prec(c) <= prec(stack.peek())){
                    if(stack.peek() == '('){return "Invalid Expression";}
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid Expression";}
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args){
        String exp = "(A+B/C*(D+E)-F)";
        infixToPost obj = new infixToPost();
        System.out.println(obj.infixToPostfix(exp));
    }
}
