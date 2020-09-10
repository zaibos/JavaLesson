package main.java;

public class restapi {
    public void func1 (String a,String b){
        System.out.println(a+ " "+b);
    }

    public void func1 (String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        restapi obj = new restapi();
        obj.func1("zuhaib");
        obj.func1("zuhaib","vishal");
    }
}
