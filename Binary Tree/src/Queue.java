/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
class Queue{
  class Node{
        int data;
        Node next;  
        
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
        public Node front = null,rear = null;
        public int size;
        /*public Queue(){
            this.front = this.rear = null;
        }*/
        
        public void enQueue(int data){
            Node temp = new Node(data);
            if(rear == null){
                front = rear = temp;
                return;
            }
            rear.next = temp;
            rear = temp;
            size++;
        }
        
        public int deQueue(){
            
             
            if(front == null){
                System.out.println("Queue is empty");
                return 0;
            }
            
            Node current = front;
            //int item = this.front.data;
            front = front.next;
            
            if(front == null)
                rear = null;
            size--;
         
            return current.data;
        }
        public int size(){
             return size;
         }
    }