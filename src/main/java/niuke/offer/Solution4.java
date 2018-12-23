package niuke.offer;

/**
 * @Description 根据前序遍历和中序遍历，重建二叉树
 * @Author Skye
 * @Date 2018/12/9 17:12
 * @Version 1.0
 **/
//todo 未完成
public class Solution4 {
    //case1由前序遍历可知根节点
    //case2由中序遍历可知左右子节点
    //case3若左右子节点有null则结束该子树

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */

      //Definition for binary tree
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
          TreeNode root = new TreeNode(pre[0]);
          int partitionOfIn = pre[0];
          int lo = 0; int hi = in.length;
          //二分查找
          int indexOfPartition,mid;
          while (lo <= hi){
             mid = (lo+hi)/2;
            if (partitionOfIn > in[mid]) lo = mid;
            else if (partitionOfIn < in[mid]) hi=mid;
            else indexOfPartition = mid;
          }

return null;

    }
    private int getIndex(int[] in, int lo, int hi, int cmp){
return 0;

    }

}
