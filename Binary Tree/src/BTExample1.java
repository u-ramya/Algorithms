/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */

    class Node{
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    public class BTExample1 {
    public  Node root;
    void BinaryTree(int data){
        root = new Node(data);
    }
    
    void BinaryTree(){
        root = null;
    }
    
    public static void main(String[] args){
        BTExample1 bt = new BTExample1();
        
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right =new Node(3);
        bt.root.left.left = new Node(4);
        
    }
}
