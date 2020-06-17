import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import sun.reflect.generics.tree.Tree;

public class BinaryTreeSerialization {
    public static void main(final String[] args) {
        Codec codec = new Codec();
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        root.left = two;
        root.right = three;
        three.left = four;
        three.right = five;
        System.out.println(codec.serialize(root));
    }

}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(final int x) {
        val = x;
    }
}

class Codec {
    // Encodes a tree to a single string.
    public String serialize(final TreeNode root) {
        final LinkedList<TreeNode> queue = new LinkedList<>();
        List<TreeNode> list = new ArrayList<>();
        // add the first root node to the queue
        queue.offer(root);
        list.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                queue.offer(node.left);
                queue.offer(node.right);
                list.add(node.left);
                list.add(node.right);
            }
        }
        //remove nulls at tail
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == null)
                list.remove(i);
            else 
                break;
        }
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (TreeNode node : list) {
            if (node != null)
                builder.append(node.val);
            else
                builder.append("null");
            builder.append(',');
        }
        builder.setCharAt(builder.length() - 1, ']');
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    // public TreeNode deserialize(final String data) {
    //     String arrStr = data.substring(1, data.length() - 1);
    //     String[] datas = arrStr.split(",");
        


    // }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
