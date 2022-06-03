package JavaExercises;

import java.util.*;

public class Collections
{
    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet treeSet = new TreeSet();
        Queue queue = new PriorityQueue();
        HashMap hashMap = new HashMap();
        Hashtable hashtable = new Hashtable();
        TreeMap treeMap = new TreeMap();



        long startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){arrayList.add(i);}
        System.out.print("Array List-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        arrayList.contains(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){linkedList.add(i);}
        System.out.print("Linked List-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        linkedList.contains(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){hashSet.add(i);}
        System.out.print("Hash Set-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        hashSet.contains(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){linkedHashSet.add(i);}
        System.out.print("linked Hash Set-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        linkedHashSet.contains(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){treeSet.add(i);}
        System.out.print("Tree Set-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        treeSet.contains(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){queue.add(i);}
        System.out.print("P queue-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        queue.contains(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){hashMap.put(i, i);}
        System.out.print("Hashmap-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        hashMap.containsKey(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){hashtable.put(i,i);}
        System.out.print("Hash Table-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        hashtable.contains(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));


        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){treeMap.put(i,i);}
        System.out.print("Tree Map-> Insertion: "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        treeMap.containsKey(50000);
        System.out.println(" Search: "+(System.currentTimeMillis()-startTime));




    }



}