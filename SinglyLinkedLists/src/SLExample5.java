/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
//program to delete a node from the middle of the singly linked lists
public class SLExample5 {
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
    
    public int size;
    //addNode() will add a new node to the list
    public void addNode(int data){
        //Create a new node
        Node newNode = new Node(data);
        //checks if the list is empty
        if(head == null){
            //if the list is empty both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else{
            //newNode will be added after tail such that tail's next will point to the newNode
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    //deleteFromMid() will delete a node from the middle of the list
    public void deleteFromMid(){
        Node temp,current;
        //checks if the list is empty
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            //Store the mid position of the list
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
            //checks whether the head is equal to the tail or not,if yes then the list has only one node
            if(head != tail){
                //Initially temp will point to head
                temp = head;
                current = null; //current will point node previous to the temp
                //if temp is pointing to node 2 then current will point to node 1
                for(int i = 0; i < count-1; i++){
                    current = temp;
                    temp = temp.next;
                }
                if(current != null){
                    //temp is the middle that needs to be removed
                    //so current node will point to next to temp by skipping 
                    current.next = temp.next;
                    //delete temp
                    temp = null;
                }
                //if current points to null, then head and tail will point to node next to temp
                else{
                    head = tail = temp.next;
                    //delete temp
                    temp = null;
                }
            }
            //if the list contains only one element
            //then it will remove it and both head and tail will point to null
            else{
                head = tail = null;
            }
               
        }
        size--;
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
            //prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
      
    //main method
    public static void main(String[] args){
        SLExample5 sList = new SLExample5();
        
        //adds data to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        
        //Printing original list
        System.out.println("Original List");
        sList.display();
        
        while(sList.head != null){
            sList.deleteFromMid();
            //Printing updated list
            System.out.println("Updated list: ");
            sList.display();
        }
    }
}
