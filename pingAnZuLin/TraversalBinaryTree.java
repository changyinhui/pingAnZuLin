package pingAnZuLin;


import java.util.LinkedList;

public class TraversalBinaryTree {

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree();
        preOrderTriversal1(root);
    }

    /**
     * 前序遍历--递归
     * @param root
     */
    public static void preOrderTriversal1(BinaryTree root) {
        if (root != null){
            System.out.println(root.val);
            preOrderTriversal1(root.left);
            preOrderTriversal1(root.right);
        }
    }

    /**
     * 前序遍历--非递归
     * @param root
     */
    public static void preOrderTriversal2(BinaryTree root) {
        LinkedList<BinaryTree> stack = new LinkedList<>();
        BinaryTree pNode = root;
        while(pNode != null || stack.isEmpty()){
            if (pNode != null){
                System.out.println(pNode.val + " ");
                stack.push(pNode);
                pNode = pNode.left;
            }
            else {
                BinaryTree node = stack.pop();
                pNode = node.right;
            }

        }

    }


}


class BinaryTree<K>{
    K val;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(K val, BinaryTree left, BinaryTree right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    BinaryTree(){}
}