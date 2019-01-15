package niuke.offer;

/**
 * @Description 将源树改为镜像
 * @Author Skye
 * @Date 2019/1/13 10:20
 * @Version 1.0
 **/
public class MirrorSolution {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;


        public TreeNode(int val) {
            this.val = val;

        }
    }
    public void Mirror(TreeNode root) {
        if (root == null) return;
        Mirror(root.left);
        Mirror(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
    private TreeNode createTree(int[] val) {
        TreeNode[] nodes = new TreeNode[val.length+1];
        for (int i = 0; i < val.length; i ++){
            TreeNode treeNode = new TreeNode(val[i]);
            if (i ==0) nodes[1] = treeNode;
            else
                nodes[(i+1)] = treeNode;
        }
        for (int i = 1; i < (nodes.length)/2;i++) {
            nodes[i] .left = nodes[2*i];
            if ((2*i+1) <= nodes.length -1)nodes[i].right = nodes[2*i+1];
        }
        return nodes[1];
    }

    public static void main(String[] args) {
        MirrorSolution solution = new MirrorSolution();
        TreeNode treeNode = solution.createTree(new int[]{8,6,10,5,7,9,11});
        solution.Mirror(treeNode);
    }
}
