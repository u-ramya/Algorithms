/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SLExample4 {
    
    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
    
    //addNode() will add a new Node to the list
    public void addNode(int data){
        //create a new Node
        Node newNode = new Node(data);
        
        //Checks if the list is empty
        if(head == null){
            //if list is empty, both head and tail will point to the new Node
            head = newNode;
            tail = newNode;
        }
        
        else{
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    
   // deleteFromStart() will delete a node from the beginning of the list
    public void deleteFromStart() {
         //Checks if the list is empty
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         else{
             //Checks whether the list contains only one node
             //if not, the head will point to the next node in the list
             if(head != null){
                 head = head.next;
             }
             //if the list contains only one node
             //then,it will remove it and both tail and head will point to null
             else{
                 head = tail = null;
             }
             
         }
    }
    
    //display() will display all the nodes present in the list
    public void display(){
        //Node current will point to head
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current != null){
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        SLExample4 sList = new SLExample4();
        
        //adds data to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        
        //Printing original list
        System.out.println("Original list: ");
        sList.display();
        
        while(sList.head != null){
            sList.deleteFromStart();
            //Priting updated list
            System.out.println("Updated list: ");
            sList.display();
        }
    }
}
