/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class SLExample1 {
    Node head; // head of list
    static class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null;}
    }
    
    //This function prints contents of the linked list
    
    public void display(){
        Node n = head;
        while(n != null){
            System.out.print(n.data + "\n");
            n = n.next;
        }
    }
    
    //method to create a simple linked list with 3 nodes
    public static void main(String[] args){
        //Start with empty list
        
        SLExample1 list = new SLExample1();
        
        list.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        
        list.head.next = second;
        second.next = third;
        list.display();
    }
}
