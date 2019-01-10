package niuke.offer;

import java.util.ArrayList;
import java.util.Arrays;

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
          if (pre == null) return null;
        if (pre.length == 1) return new TreeNode(pre[0]);
        if (in == null) return null;
        TreeNode root = new TreeNode(pre[0]);
        int index = indexOf(pre[0], in);
        root.left = reConstructBinaryTree(subList(pre,1, index+1), subList(in,0,index));
        root.right = reConstructBinaryTree(subList(pre,index+1, pre.length), subList(in, index+1,in.length));
        return root;
    }
    private int indexOf(int val, int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            if (val == arr[i]) return i;
        }
        return -1;
    }
    private int[] subList(int [] arr, int fromIndex, int toIndex ){
          int[] result = new int[toIndex - fromIndex];
          for (int i = 0; i < result.length; i ++){
              result[i] = arr[i+fromIndex];
          }
          return result;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int result[] = s.subList(new int[]{1,2,3,4,5,6}, 1,5);
        System.out.println(Arrays.toString(result));
    }

}
