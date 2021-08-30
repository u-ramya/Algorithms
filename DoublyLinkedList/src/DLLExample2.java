/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class DLLExample2 {
    public static class Node{
        int data;
        Node left;
        Node middle;
        Node right;
        
        public Node(int data){
            this.data = data; 
        }
    }
    
    public Node root;
    public Node head =null, tail = null;
    
    public void convertTernaryToDLL(Node node){
        if(node == null)
            return;
        
        Node left = node.left;
        Node middle = node.middle;
        Node right = node.right;
        
        if(head == null){
            head = tail = node;
            node.middle = null;
            head.left = null;
            tail.right = null;
        }
        
        else{
            tail.right = node;
            node.left = tail;
            node.middle = null;
            tail = node;
            tail.right = null;
        }
        convertTernaryToDLL(left);
        convertTernaryToDLL(middle);
        convertTernaryToDLL(right);
    }
    
    public void displayDLL(){
        Node current = head;
        if(head == null){
            System.out.println();
            return;
        }
        
        System.out.println("Nodes of generated doubly linked list");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        DLLExample2 tree = new DLLExample2();
        
        //add nodes to the ternary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.middle = new Node(3);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(5);
        tree.root.left.middle = new Node(6);
        tree.root.left.right = new Node(7);
        tree.root.middle.left = new Node(8);
        tree.root.middle.middle = new Node(9);
        tree.root.middle.right = new Node(10);
        tree.root.right.left = new Node(11);
        tree.root.right.middle = new Node(12);
        tree.root.right.right = new Node(13);
        
        tree.convertTernaryToDLL(tree.root);
        
        tree.displayDLL();
    }
}
