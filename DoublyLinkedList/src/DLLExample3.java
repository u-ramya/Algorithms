/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class DLLExample3 {
    class Node{
        int data;
        Node previous;
        Node next;
        
        public Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    int size;
    public void addNode(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
        size++;
    }
    
    public void countNodes(){
        System.out.println("Number of nodes in the list:  " + size);
    }
    
    public void reverse(){
        Node current = head;
        Node temp = null;
        
        while(current != null){
            temp = current.next;
            current.next = current.previous;
            current.previous = temp;
            current = current.previous;
        }
        //Swap the head and tail pointers
        temp = head;
        head = tail;
        tail = temp;
    }
    
    public void deleteFromBegin(){
        
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            if(head != tail){
                head = head.next;
                head.previous = null;
                
            }
            else{
                head = tail = null;
            }
        }
        size--;
    }
    
    public void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            
            if(head != tail){
                tail = tail.previous;
                tail.next = null;
            }
            else{
                head = tail =null;
            }
        }
        size --;
    }
    
    public void deleteFromMid(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            
                Node current = head;
                int count = (size%2 == 0)? (size/2):((size+1)/2);
                for(int i = 1;i<count; i++){
                    current = current.next;
            }
                if(current == head){
                    head = current.next;
                }
                else if(current == tail){
                    tail = tail.previous;
                }
                else{
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                current = null;
            }
        size--;
    }
    
    public void minimumNode(){
        Node current = head;
        int min;
        
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            min = head.data;
            while(current != null){
                if(min > current.data)
                    min = current.data;
                    current = current.next;
                
            }
            System.out.println("Minimum value node: " + min);
        }
    }
    
    public void maximumNode(){
        Node current = head;
        int max;
        
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            max = head.data;
            while(current != null){
                if(max < current.data)
                    max = current.data;
                    current = current.next;
                
            }
            System.out.println("Maximum value node: " + max);
        }
    }
    
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
          System.out.println("Nodes of the doubly linked list ");
          while(current != null){
              System.out.print(current.data + " ");
              current = current.next;
          }
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        DLLExample3 dList = new DLLExample3();
        
        //add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);
        dList.addNode(6);
        dList.addNode(7);
        
        dList.countNodes();
        dList.display();
        
        dList.maximumNode();
        dList.minimumNode();
        
        dList.reverse();
        dList.display();
        
        dList.deleteFromBegin();
        dList.display();
        
        dList.deleteFromEnd();
        dList.display();
        
        dList.deleteFromMid();
        dList.display();
        
        
    }
}
