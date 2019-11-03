import java.util.*;
import java.lang.*;
import java.io.*;
//The first line of input contains an integer, the number of test cases T. T testcases follow. Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). In the second line of every testcase it contains of an integer N.
public class SeriesAP {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for(int i=0;i<t;i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int n = sc.nextInt();
            int d = a2-a1;
            L.add(a1 + (n-1)*d);}
        for(Integer z: L){
            System.out.println(z);}
        }
    }

