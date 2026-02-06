// leetcode 979
// time - o(n)
// space - o(1)

import java.util.*;

public class DistributeCoins{

    int moves;

    public static void main(String[] args){

        DistributeCoins obj = new DistributeCoins();

        int[] arr = new int[]{3 , 0 ,0};
        
        TreeNode root = obj.buildTreeNode(arr);
        obj.dfs(root);
        System.out.println(obj.moves);

    }

    private int dfs(TreeNode node){

        if(node == null){
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        moves+= Math.abs(left) + Math.abs(right);

        return node.val + left + right -1;
    }

    private TreeNode buildTreeNode(int[] arr){

        if(arr.length == 0 || arr[0] == -1){
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        q.add(root);

        int i=1;

        while(!q.isEmpty() && i < arr.length){

            TreeNode curr = q.poll();

            if(i < arr.length && arr[i] != -1){
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }

            i++;

            if(i < arr.length && arr[i] != -1){
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }

        return root;
    }

}

class TreeNode{

    int val;
    TreeNode left , right;

    public TreeNode(int val){
        this.val = val;
    }
}