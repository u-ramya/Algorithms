/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godavarthy
 */
//import java.util.LinkedList;
//import java.util.Queue;

public class BTExample2 {
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    public Node root = null;
    
   /* public void DiffOddEven(){
        root = null;
    }*/
    int oddLevel = 0;
        int evenLevel = 0;
        int diffOddEven = 0;
        
        int nodesInLevel = 0;
        int currentLevel = 0;
    
    public int difference(Node root){
        
        
        Queue queue = new Queue();
        if(root == null){
            System.out.println("Tree is empty");
            return 0;
        }
        else{
            Node temp = root;
            queue.enQueue(temp.data);
            currentLevel++;
            
            while(queue.size() != 0){
                nodesInLevel = queue.size();
                
                while(nodesInLevel > 0){
                    
                    int current = queue.deQueue();
                    
                    
                    if(currentLevel % 2 == 0)
                        evenLevel += current;
                    else
                        oddLevel += current;
                    
                    nodesInLevel--;
                }
                    
                    if(temp.left != null)
                        difference(temp.left);
                        
                    if(temp.right != null)
                        difference(temp.right);
                    
                
                currentLevel++;
            }
            diffOddEven = (oddLevel - evenLevel);
        }
        return diffOddEven;
    }
    
    public static void main(String[] args){
        
        BTExample2 bt = new BTExample2();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);
        
        System.out.println("Difference between sum of odd level and even level nodes: " + bt.difference(bt.root));
    }
}
