/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SLExample3 {
    
    //Reprresent a node of singly linked list
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
        //create a new node
        Node newNode = new Node(data);
        
        //Checks if the list is empty 
        if(head == null){
            //If list is empty, both head and tail will point to newNode
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
    
    //countNodes() will count the nodes present in the list
    public int countNodes(){
        int count = 0;
        //Node current will point to head
        Node current = head;
        
        while(current != null){
            //Increment the count by 1 for each node
            count++;
            current = current.next;
        }
        return count;
    }
    
    //display() will display all the nodes present in the list
    public void display(){
        //Node current will point to the head
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null){
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        SLExample3 sList =  new SLExample3();
        
        //add Nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        
        //Displays the node present in the list
        sList.display();
        
        //Count the nodes present in the given list
        System.out.println("Count of nodes present in the list:  " + sList.countNodes());
    }
}
