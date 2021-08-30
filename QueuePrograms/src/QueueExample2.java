/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */

    class qNode{
        int data;
        qNode next;  
        
        public qNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    class Queue1{
        qNode front,rear;
        
        public Queue1(){
            this.front = this.rear = null;
        }
        
        void enQueue(int data){
            qNode temp = new qNode(data);
            if(this.rear == null){
                this.front = this.rear = temp;
                return;
            }
            this.rear.next = temp;
            this.rear = temp;
        }
        
        int deQueue(){
            if(this.front == null)
                return 0;
            
            int item = this.front.data;
            this.front = this.front.next;
            
            if(this.front == null)
                this.rear = null;
            return item;
        }
    }
    public class QueueExample2 {
        public static void main(String[] args){
            Queue1 q = new Queue1();
            q.enQueue(10);
            q.enQueue(20);
            System.out.println(q.deQueue());
            q.deQueue();
            q.enQueue(30);
            q.enQueue(40);
            q.enQueue(50);
            q.deQueue();
            
            System.out.println("Queue Front: " + q.front.data);
            System.out.println("Queue Rear: " + q.rear.data);

        }
}
