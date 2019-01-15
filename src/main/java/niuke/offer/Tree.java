package niuke.offer;

import java.util.Stack;

/**
 * @Description 二叉树的四种递归和非递归遍历
 * @Author Skye
 * @Date 2019/1/15 11:17
 * @Version 1.0
 **/
public class Tree<T extends Comparable<T>> {
    class TreeNode<T>{
        T val;
        TreeNode left;
        TreeNode right;
        TreeNode (T val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public TreeNode createBinaryTree(){
        TreeNode<Integer> root = new TreeNode<>(5);
        root.left = new TreeNode<>(4);
        root.right = new TreeNode<>(3);
        root.left.right = new TreeNode<>(1);
        root.right.left = new TreeNode<>(2);
        root.right.right = new TreeNode<>(7);
        return root;
    }
    public void preOrder(TreeNode root){
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TreeNode root){
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public void preOrderNoRe(TreeNode<T> root){
        Stack<TreeNode> stack = new Stack<>();
        while (root != null||!stack.isEmpty()) {
             while (root != null) {
                 stack.push(root);
                 System.out.print(root.val+" ");
                 root = root.left;
             }
             if (!stack.isEmpty()){
                 root  = stack.pop();
                 root = root.right;

             }
        }
    }

    public void inOrderNoRe(TreeNode<T> root){
        Stack<TreeNode> stack = new Stack<>();
        while (root != null||!stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()){
                root  = stack.pop();
                System.out.print(root.val+" ");
                root = root.right;

            }
        }
    }
    public void postOrderNoRe(TreeNode<T> root){
        Stack <TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            boolean tag = true;
            TreeNode preNode = null;
            while (!stack.isEmpty() && tag) {
                root = stack.peek();
                if (root.right == preNode) {
                    root = stack.pop();
                    System.out.print(root.val + " ");
                    if (stack.isEmpty()) {
                        return;
                    } else preNode = root;
                } else {
                    root = root.right;
                    tag = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree <Integer> tree = new Tree<>();
        Tree.TreeNode root =tree.createBinaryTree();
        System.out.print("前序遍历：");
        tree .preOrder(root);
        System.out.print("\n中序遍历：");
        tree.inOrder(root);
        System.out.print("\n后序遍历：");
        tree.postOrder(root);

        System.out.print("\n非递归: ");
        System.out.print("\n前序：");
        tree.preOrderNoRe(root);
        System.out.print("\n中序：");
        tree.inOrderNoRe(root);
        System.out.print("\n后序：");
        tree.postOrderNoRe(root);

    }
}
