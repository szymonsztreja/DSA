package org.example;

import org.example.algorithims.*;
import org.example.datastructures.NodeDL;
import org.example.datastructures.NodeSL;
import org.example.datastructures.Stack;
import org.example.searching.BinarySearch;
import org.example.searching.LinearSearch;
import org.example.searching.SearchingAlgorithim;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[20];
        Random rand = new Random();
//        for (int i = 0; i < 20; i++) {
//            arr[i] = rand.nextInt(100);  // 0 to 99
//        }
        int[] arr = rand.ints(20, 0, 100).toArray();

        System.out.println(Arrays.toString(arr));
        SortingAlgorithim sortingAlgorithim = new MergeSort();
        sortingAlgorithim.sort(arr);
        System.out.println(Arrays.toString(arr));

        SearchingAlgorithim sa = new LinearSearch();
        System.out.println(sa.search(arr, 42));
        sa = new BinarySearch();
        System.out.println(sa.search(arr, 42));

        singlyLinkedListExample();
        doublyLinkedListExample();
//        stackExample();


    }

    public static void stackExample() {
        Stack stack = new Stack(5);  // Capacity 5 for overflow test

        System.out.println("Initial: empty=" + stack.isEmpty() + ", size=" + stack.size());

        // Push elements
        stack.push(10);
        stack.push(-20);
        stack.push(30);
        System.out.println("After pushes: empty=" + stack.isEmpty() + ", size=" + stack.size());
        System.out.println("Peek: " + stack.peek());

        // Pop elements
        System.out.println("Pop: " + stack.pop());  // 30
        System.out.println("Pop: " + stack.pop());  // -20
        System.out.println("Now: empty=" + stack.isEmpty() + ", size=" + stack.size());

        // Underflow test
        System.out.println("Pop empty: " + stack.pop());
        System.out.println("Pop size:" + stack.size());

        // Overflow test
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
    }

        public static void singlyLinkedListExample(){

        System.out.println("Single Link List");

        NodeSL firstNode = new NodeSL(1);
        NodeSL secondNode = new NodeSL(2);
        NodeSL thirdNode = new NodeSL(3);
        NodeSL forthNode = new NodeSL(4);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        NodeSL currentNode = firstNode;

        while( currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");


        NodeSL head = thirdNode.deleteSpecificNode(firstNode, thirdNode);

        System.out.println("DELETION");
        currentNode = firstNode;
        while( currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");
    }

    public static void doublyLinkedListExample(){

        System.out.println("Double Link List");
        NodeDL firstNode = new NodeDL(1);
        NodeDL secondNode = new NodeDL(2);
        NodeDL thirdNode = new NodeDL(3);
        NodeDL forthNode = new NodeDL(4);

        firstNode.next = secondNode;
        secondNode.prev = firstNode;
        secondNode.next = thirdNode;
        thirdNode.prev = secondNode;
        thirdNode.next = forthNode;
        forthNode.prev = thirdNode;

        NodeDL currentNode = firstNode;

        System.out.print("Forward: ");
        while( currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");

        currentNode = forthNode;
        System.out.print("Backward: ");
        while( currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.prev;
        }
        System.out.print("null\n");
    }
}