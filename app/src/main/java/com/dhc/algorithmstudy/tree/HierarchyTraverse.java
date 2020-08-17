package com.dhc.algorithmstudy.tree;

import android.widget.TextView;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author donghongchen
 * @create 2020-08-17 15:36
 *
 * 《剑指offer2》 第32题
 *  分行从上倒下打印二叉树。
 */
public class HierarchyTraverse {

    public static void printTree(TreeNode node, TextView display) {
        int currentNodeCount = 0;
        int nextNodeCount = 0;

        Queue<TreeNode> nodeQueue = new LinkedBlockingQueue<>();
        nodeQueue.add(node);
        currentNodeCount++;

        while ((node = nodeQueue.poll()) != null) {
            if (currentNodeCount == 0) {
                currentNodeCount = nextNodeCount;
                nextNodeCount = 0;
                display.append("\n");
            }

            display.append(node.value + " ");
            currentNodeCount--;

            if (node.leftChild != null) {
                nodeQueue.add(node.leftChild);
                nextNodeCount++;
            }

            if (node.rightChild != null) {
                nodeQueue.add(node.rightChild);
                nextNodeCount++;
            }
        }


    }

}
