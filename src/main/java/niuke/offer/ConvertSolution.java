package niuke.offer;

/**
 * @Description 将一颗二叉搜索树转换成一个排好序的双向链表
 * @Author Skye
 * @Date 2019/1/14 21:02
 * @Version 1.0
 **/
public class ConvertSolution {
    private final boolean isLeft = true;
    private final boolean isRight = false;
    private static boolean mostLeft = false;
    private TreeNode newHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        convert(pRootOfTree,true);
        return newHead;
    }
    private TreeNode convert(TreeNode root,boolean isSubLeft){
        if (root == null) return null;
        if (root.left==null&&root.right==null) return root;//左右节点均为空
        TreeNode left = convert(root.left,isLeft);
        if (!mostLeft) {
            newHead = left;//当遍历至最左边时执行一次
            mostLeft = true;
        }
        TreeNode right=convert(root.right,isRight);
        if(left==null&&right!=null) {//左节点为空，右节点不为空
            root.right = right;
            right.left = root;
            if (isLeft){
                return right;
            }else return root;
        }else if (right == null && left != null) {//右节点为空，左节点不为空
            left.right=root;
            root.left = left;
            if (isLeft){
                return root;
            }else return left;
        }else {//左右节点均不为空
            //使一个跟节点和两个左右子节点变成顺序双向链表
            left.right = root;
            root.left = left;
            root.right = right;
            right.left = root;
            if (isSubLeft){
                return right;
            }else return left;
        }
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left=new TreeNode(4);
        node.left.left = new TreeNode(3);
        node.left.left.left = new TreeNode(2);
        node.left.left.left.left = new TreeNode(1);

        ConvertSolution solution = new ConvertSolution();
        TreeNode head = solution.Convert( node);


        System.out.println(head);
    }
}
