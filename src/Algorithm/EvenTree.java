package Algorithm;

import java.io.*;
import java.util.*;

public class EvenTree {

	static class Node {
        int n;
        int d = 1;
        int v= 0;
        ArrayList<Node> list;
        Node (int n) {
            this.n = n;
            list = new ArrayList<Node>();
        }
    }
    static LinkedList<Node> queue = new LinkedList<Node>();
    static int cnt = 0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer,Node> map = new HashMap<Integer,Node>();
        for (int i = 1;i<=n;i++) {
            Node node = new Node(i);
            map.put(i,node);
        }
        for (int i = 1; i<=m; i++) {
            int s = in.nextInt();
            Node ns = map.get(s);
            int d = in.nextInt();
            Node nd = map.get(d);
            if(!ns.list.contains(nd)) {
                //System.out.println("Add: "+ nd.n + "to:" + ns.n);
                ns.list.add(nd);
            }
            if (!nd.list.contains(ns)) {
                //System.out.println("Add: "+ ns.n + "to:" + nd.n);
                nd.list.add(ns);
            }
        }
        initializeD(map.get(1));
        queue.add(map.get(1));
        countEven();
        System.out.println(cnt);
    }
    static int initializeD(Node node) {
        node.v =1;
        for (Node a:node.list) {
            if (a.v == 0)
                node.d = node.d + initializeD(a);
            a.v =1;
        }
        
        return node.d;
    }
    
    
    
    static void countEven() {
        
        while (!queue.isEmpty()) {
            Node a = queue.removeFirst();
            a.v =2;
            for (Node b:a.list) {
                if (b.v == 1) {
                //System.out.println(b.n + " " +b.d);
                if (b.d % 2 == 0) {
                    cnt++;
                }
            
            queue.addLast(b);
                }
            }
        }
        
    }
	
}
