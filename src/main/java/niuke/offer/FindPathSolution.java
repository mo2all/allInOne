package niuke.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Skye
 * @Date 2019/1/14 15:05
 * @Version 1.0
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class FindPathSolution {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(0);
        finPath(root, target, resultList,pathList);
        return resultList;
    }
    //pathList 第0位为结果
    private  ArrayList<ArrayList<Integer>> finPath(TreeNode root,int target,ArrayList<ArrayList<Integer>> resultList,ArrayList<Integer> pathList){
        if(root==null) return resultList;
        pathList.add(root.val);
        pathList.set(0, pathList.get(0) + root.val);
        if (pathList.get(0) > target ) {
            return resultList;
        }else if (pathList.get(0)==target&&root.left==null&&root.right==null){
            resultList.add(new ArrayList<>(pathList.subList(1,pathList.size())));
            return resultList;
        }else {
            finPath(root.left,target,resultList,(ArrayList<Integer>) pathList.clone());
            finPath(root.right,target,resultList,(ArrayList<Integer>)pathList.clone());
        }
        return resultList;
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

    public static void main(String[] args){
        FindPathSolution solution = new FindPathSolution();
        TreeNode node = solution.createTree(new int[]{10,5 ,12,4,7});
        ArrayList<ArrayList<Integer>>  list = solution.FindPath(node, 22);
        System.out.println(list);

    }
}
