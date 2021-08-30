/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class DLLExample1 {
     public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     
     public Node root;
     public Node head = null;
     public Node tail = null;
     
     public void convertBtToDLL(Node node){
         if(node == null)
             return;
             
             convertBtToDLL(node.left);
             
             if(head == null){
                 head = tail = node;
             }
             else{
                 tail.right = node;
                 node.left = tail;
                 tail = node;
             }
             convertBtToDLL(node.right);
         }
     public void display(){
         Node current = head;
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         System.out.println("Nodes of generated doubly linked list:");
         while(current != null){
             System.out.print(current.data + " ");
             current = current.right;
         }
         System.out.println();
     }
     
     public static void main(String[] args){
         DLLExample1 bt = new DLLExample1();
         
        //add nodes to the binary tree
        bt.root = new Node(1);
       bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        
        bt.display();
        
        bt.convertBtToDLL(bt.root);
        
        bt.display();
     }
}
