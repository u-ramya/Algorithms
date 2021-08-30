/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
public class BTExample3 {
    public static class Node{
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public Node root;
    public void BinarySearchTree(){
        root = null;
    }
    
    public void insert(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return;
        }
        else{
            Node current = root,parent = null;
            while(true){
                parent = current;
                if(data < current.data){
                    current = current.left;
                    if(current == null){
                    parent.left = newNode;
                    return;
                    }
                
            }
            
            else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                    }
            }
        }
    }
    
    public Node minNode(Node root){
        if(root.left != null)
            return minNode(root.left);
        else 
            return root;
    }
    
    public Node deleteNode(Node node, int value){
        if(node == null){
            return null;
        }
        
        else{
            if(value < node.data)
                node.left = deleteNode(node.left,value);
            else if(value > node.data)
                node.right = deleteNode(node.right,value);
            
            else{
                if(node.left == null && node.right == null)
                    node = null;
                else if(node.left == null){
                    node = node.right;
                }
                else if(node.right == null){
                    node = node.left;
                }
                
                else{
                    Node temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = deleteNode(node.right,temp.data);
                }
                
            }
            return node;
        }
    }
    
    public void inorderTraversal(Node node){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        
        else{
            if(node.left != null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right != null)
                inorderTraversal(node.right);
        }
    }
    
    public static void main(String[] args){
        BTExample3 bt = new BTExample3();
        
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);
        
        System.out.println("Binary search tree after insertion:");
        bt.inorderTraversal(bt.root);
        
        Node deletedNode = null;
        deletedNode = bt.deleteNode(bt.root,90);
        System.out.println("\nBinary Search Tree after deleting 90: ");
        
        bt.inorderTraversal(bt.root);
        
    }
}
