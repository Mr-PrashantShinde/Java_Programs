/*
TechGig
Q1- Counting Leafs  
Problem Statement
Counting Leafs (100 Marks)
You are given a tree with N nodes numbered from 0 to N-1 . You are also given a node X which you are supposed to delete. You have to tell the number of leaf nodes in the tree after deleting the given node. Note that deleting a node deletes all the nodes in its subtree.


In the input you are given an array A, where Ai is the parent of ith node. The node with parent -1 is the root of the tree. It is guaranteed that there is exactly one root of the tree.

Input Format
First line contains an integer N - the number of nodes in the tree.
Second line contains N integers representing the array A.
Third line contains an integer representing the node to delete.

Constraints
1 <= N <= 100
-1 <= Ai <= (N-1)
0 <= X <= (N-1)

Output Format
Print a single integer representing the number of leafs in the tree after deleting the given node.

Sample TestCase 1
Input
5
-1 0 0 1 1
2
Output
2
Explanation
The corresponding tree is shown in the problem statement above. Initially, there are 3 leafs 2, 3 and 4 (marked in green color). If we delete the node 2, two leafs are left i.e 3 and 4. Hence, answer is 2.

Sample TestCase 2
Input
5
-1 0 0 1 1
1
Output
1
Explanation
After deleting node 1 the only leaf node left is 2.
*/

// Java program to remove nodes on root to leaf paths of length < k
  
/* Class containing left and right child of current 
   node and key value*/
   class Node 
   {
       int data;
       Node left, right;
     
       public Node(int item) 
       {
           data = item;
           left = right = null;
       }
   }
     
   class BinaryTree 
   {
       Node root;
     
       // Utility method that actually removes the nodes which are not
       // on the pathLen >= k. This method can change the root as well.
       Node removeShortPathNodesUtil(Node node, int level, int k) 
       {
           //Base condition
           if (node == null)
               return null;
                
           // Traverse the tree in postorder fashion so that if a leaf
           // node path length is shorter than k, then that node and
           // all of its descendants till the node which are not
           // on some other path are removed.
           node.left = removeShortPathNodesUtil(node.left, level + 1, k);
           node.right = removeShortPathNodesUtil(node.right, level + 1, k);
     
           // If root is a leaf node and it's level is less than k then
           // remove this node.
           // This goes up and check for the ancestor nodes also for the
           // same condition till it finds a node which is a part of other
           // path(s) too.
           if (node.left == null && node.right == null && level < k)
               return null;
     
           // Return root;
           return node;
       }
     
       // Method which calls the utitlity method to remove the short path
       // nodes.
       Node removeShortPathNodes(Node node, int k) 
       {
           int pathLen = 0;
           return removeShortPathNodesUtil(node, 1, k);
       }
     
       //Method to print the tree in inorder fashion.
       void printInorder(Node node) 
       {
           if (node != null) 
           {
               printInorder(node.left);
               System.out.print(node.data + " ");
               printInorder(node.right);
           }
       }
     
       // Driver program to test for samples
       public static void main(String args[]) 
       {
           BinaryTree tree = new BinaryTree();
           int k = 4;
           tree.root = new Node(1);
           tree.root.left = new Node(2);
           tree.root.right = new Node(3);
           tree.root.left.left = new Node(4);
           tree.root.left.right = new Node(5);
           tree.root.left.left.left = new Node(7);
           tree.root.right.right = new Node(6);
           tree.root.right.right.left = new Node(8);
           System.out.println("The inorder traversal of original tree is : ");
           tree.printInorder(tree.root);
           Node res = tree.removeShortPathNodes(tree.root, k);
           System.out.println("");
           System.out.println("The inorder traversal of modified tree is : ");
           tree.printInorder(res);
       }
   }


   