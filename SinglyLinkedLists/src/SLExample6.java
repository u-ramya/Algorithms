/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SLExample6 {
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head = null;
    public Node tail = null;
    
    //adding nodes
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        
        else{
            tail.next = newNode;
            tail = newNode;
        }
                
    }
    
    public void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        
        else{
            if(head != tail){
                Node current = head;
                while(current.next != tail){
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else{
                head = tail = null;
            }
        }
    }
    
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    //main method
    public static void main(String[] args){
        SLExample6 sList = new SLExample6();
        
        //Creating a singly list by adding nodes
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        sList.addNode(8);
        sList.addNode(7);
        
        System.out.println("Original List:");
        sList.display();
        
        while(sList.head != null){
            sList.deleteFromEnd();
            System.out.println("Updated List: ");
            sList.display();
        }

    }
}
