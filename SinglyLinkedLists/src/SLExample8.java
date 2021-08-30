/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SLExample8 {
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
    
    //minNode will display minimum value node
    public void minNode(){
        Node current = head;
        int min;
        
        if(head == null){
            System.out.println("List is empty");
        }
        
        else{
            min = head.data;
            while(current != null){
                if(min > current.data){
                    min = current.data;
                }
                current = current.next;
            }
            
            System.out.println("Minimum value node in the list: " + min);
        }
    }
        
        public void maxNode(){
        Node current = head;
        int max;
        
        if(head == null){
            System.out.println("List is empty");
        }
        
        else{
            max = head.data;
            while(current != null){
                if(max < current.data){
                    max = current.data;
                }
                current = current.next;
            }
            
            System.out.println("Maximum value node in the list: " + max);
        }
    }
        
        public static void main(String[] args){
            SLExample8 sList = new SLExample8();
            
            //add nodes
            sList.addNode(1);
            sList.addNode(4);
            sList.addNode(3);
            sList.addNode(8);
            sList.addNode(0);
            sList.addNode(9);
            
            sList.minNode();
            sList.maxNode();
        }
}
