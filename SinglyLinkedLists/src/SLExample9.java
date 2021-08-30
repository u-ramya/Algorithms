/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SLExample9 {
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int size;
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
        size++;
    }
    
    //adding a node to the middle
    public void addInMid(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        
        else{
            Node temp,current;
            int count = (size%2 == 0)?(size/2):((size+1)/2);
            
            temp = head;
            current = null;
            
            for(int i = 0; i < count; i++){
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }
        size++;
    }
    
    
    
    public void addInBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        
        else{
            Node current = head;
            head = newNode;
            newNode.next = current;
        }
        size++;
    }
    
    public void addInLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        size++;
    }
    
    public void removeDuplicate(){
        Node current = head;
        Node temp = null,index = null;
        if(head ==  null){
            return;
        }
        
        else{
            while(current != null){
                temp = current;
                index = current.next;
                
                while(index != null){
                    if(current.data == index.data){
                        temp.next = index.next;
                    }
                    else{
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            size--;
        }
    }
    
    public void searchElement(int data){
        
        Node current = head;
        int position = 1;
        boolean flag = false;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
        while(current != null){
            if(current.data != data){
           current = current.next;
           position++;
            }
            else{
                flag = true;
                break;    
            }    
        }
        }
        if(flag)
            System.out.println(data + " Found at position: " + position);
        else
           System.out.println("Element not found");
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        SLExample9 sList = new SLExample9();
        
        sList.addNode(1);
        sList.addNode(4);
        sList.addNode(6);
        sList.addNode(4);
        sList.addNode(9);
        sList.addNode(18);
        sList.addNode(16);
        sList.addNode(18);
        
        System.out.println("Original List: ");
        sList.display();
        
        sList.addInMid(7);
        
        System.out.println("Updated List: ");
        sList.display();
        
        sList.addInBegin(1);
        System.out.println("Updated List: ");
        sList.display();
        
        sList.addInLast(20);
        System.out.println("Updated List: ");
        sList.display();
        
        sList.removeDuplicate();
        System.out.println("Updated List after removing repeated nodes: ");
        sList.display();
        
        sList.searchElement(7);
        
    }
    
}
