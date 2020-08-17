package com.dhc.algorithmstudy.tree;

/**
 * @author donghongchen
 * @create 2020-08-17 16:06
 */
public class TreeBuilder {

    /**
     * build a tree
     */
    public static TreeNode build() {
        TreeNode root = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        root.leftChild = treeNode1;
        root.rightChild = treeNode3;
        treeNode1.leftChild = treeNode2;
        treeNode2.rightChild = treeNode4;
        treeNode4.rightChild = treeNode5;
        treeNode4.leftChild = treeNode6;

        return root;
    }

}
