/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SLExample2 {
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
    
    //addNode() will add a new node to the list
    public void addNode(int data){
        //Create a new node
        Node newNode = new Node(data);
        
        //Checks if the list is empty
        if(head == null){
            //if node is empty both head and tail will point to the new Node
            head = newNode;
            tail = newNode;
        }
        
        else{
            //newNode will be added after tail such that tail's next
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    //display() will display all the nodes present in the list
    
    public void display(){
        //Node current will point to the head
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of the singly linked list: ");
        while(current != null){
            //Prints each node by increment pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    //main method
    public static void main(String[] args){
        
        SLExample2 sList = new SLExample2();
        
        //add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        
        //displays the nodes present in the list
        sList.display();
    }
}
