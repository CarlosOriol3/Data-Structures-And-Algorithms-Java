package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode root = null;

    private int numberOfNodes = 0;

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (numberOfNodes == 0) {
            this.root = newNode;
            this.numberOfNodes++;
        } else {
            TreeNode currentNode = this.root;
            while (currentNode != null) {
                if (newNode.value <= currentNode.value) {
                    if (currentNode.left != null) {
                        currentNode = currentNode.left;
                    } else {
                        currentNode.left = newNode;
                        this.numberOfNodes++;
                        break;
                    }

                } else {
                    if (currentNode.right != null) {
                        currentNode = currentNode.right;
                    } else {
                        currentNode.right = newNode;
                        this.numberOfNodes++;
                        break;
                    }
                }
            }

        }

    }

    public boolean contains(int value) {
        if (this.root == null) {
            return false;
        } else {
            TreeNode currentNode = this.root;
            while (currentNode != null) {
                if (value == currentNode.value) {
                    return true;
                } else if (value < currentNode.value) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
        return false;
    }

    // Traversals

    public ArrayList<Integer> preorderTraversal(TreeNode node, ArrayList<Integer> list) {

        list.add(node.value);

        if (node.left != null) {
            preorderTraversal(node.left, list);
        }

        if (node.right != null) {
            preorderTraversal(node.right, list);
        }

        return list;
    }

    public ArrayList<Integer> inorderTraversal(TreeNode node, ArrayList<Integer> list) {

        if (node.left != null) {
            inorderTraversal(node.left, list);
        }

        list.add(node.value);

        if (node.right != null) {
            inorderTraversal(node.right, list);
        }

        return list;
    }

    public ArrayList<Integer> postorderTraversal(TreeNode node, ArrayList<Integer> list){
        
        if(node.left != null){
            postorderTraversal(node.left, list);
        }

        if(node.right != null){
            postorderTraversal(node.right, list);
        }

        list.add(node.value);
        
        return list;
    }


    public String preorderToString() {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList = preorderTraversal(this.root, resultList);
        return resultList.toString();
    }

    public String inorderToString() {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList = inorderTraversal(this.root, resultList);
        return resultList.toString();
    }

    public String postorderToString() {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList = postorderTraversal(this.root, resultList);
        return resultList.toString();
    }



    // BFS

    public ArrayList BFS() {
        ArrayList<Integer> bfsArray = new ArrayList<>();
        TreeNode currentNode = this.root;
        Queue<TreeNode> myQueue = new LinkedList<>();

        myQueue.add(currentNode);

        while (myQueue.size() > 0) {
            currentNode = myQueue.remove();
            bfsArray.add(currentNode.value);
            if (currentNode.left != null) {
                myQueue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                myQueue.add(currentNode.right);
            }
        }
        return bfsArray;
    }
}