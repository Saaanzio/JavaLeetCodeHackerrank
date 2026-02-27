package Tree;

public class DiameterOfBinaryTree {

}


//class Solution {
//    public int maxHeight(TreeNode root) {
//        if(root == null) return 0;
//
//        return 1 + Math.max(maxHeight(root.left) + maxHeight(root.right));
//    }
//    public int diameterOfBinaryTree(TreeNode root) {
//        if(root == null) return 0;
//
//        int leftHeight = maxHeight(root.left);
//        int rightHeight = maxHeight(root.right);
//        int diameter = leftHeight + rightHeight;
//        int sub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
//        return Math.max(diameter, sub);
//    }
//}

//class Solution {
//    public int diameterOfBinaryTree(TreeNode root) {
//        int[] res = new int[1];
//        dfs(root, res);
//        return res[0];
//    }
//    private int dfs(TreeNode root, int[] res){
//        if(root == null){
//            return 0;
//        }
//        int left = dfs(root.left, res);
//        int right = dfs(root.right, res);
//        res[0] = Math.max(res[0], left + right);
//        return 1 + Math.max(left, right);
//    }
//}

