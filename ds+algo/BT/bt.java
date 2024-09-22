import java.util.*;

import javax.xml.transform.Source;

import org.w3c.dom.Node;

public class bt {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void level_order(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size(); // Get the number of nodes at the current level

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = q.poll();
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }

            System.out.println(); // Move to the next line to separate levels
        }
    }

    public static void zigzag(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            if (count % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(q.peek().data + " ");
                    if (q.peek().left != null) {
                        q.add(q.peek().left);
                    }
                    if (q.peek().right != null) {
                        q.add(q.peek().right);
                    }
                    q.remove();
                }
                count++;
            } else {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    arr.add(q.peek().data);
                    if (q.peek().left != null) {
                        q.add(q.peek().left);
                    }
                    if (q.peek().right != null) {
                        q.add(q.peek().right);
                    }
                    q.remove();
                }
                count++;

                for (int i = arr.size() - 1; i >= 0; i--) {
                    System.out.print(arr.get(i) + " ");
                }
            }

            System.out.println();
        }
    }

    public static void right_view(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(q.peek().data);
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                q.remove();
            }
            System.out.print(arr.get(arr.size() - 1) + " ");
        }
    }

    public static void left_view(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(q.peek().data);
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                q.remove();
            }
            System.out.print(arr.get(0) + " ");
        }
    }

    // Helper class to represent a node in the queue with its horizontal distance
    static class QueueNode {
        Node node;
        int horizontalDistance;

        QueueNode(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }

    public static void top_view(Node root) {
        // Initialize a queue for level order traversal
        Queue<QueueNode> queue = new LinkedList<>();
        // Add the root node with horizontal distance as 0
        queue.add(new QueueNode(root, 0));

        // Create a TreeMap to store the top view nodes with horizontal distance as the
        // key and sorts in acsending order
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Perform level order traversal
        while (!queue.isEmpty()) {
            QueueNode q = queue.poll();
            int hd = q.horizontalDistance;
            Node node = q.node;

            // If the horizontal distance is not present in the map, add it to the map
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            // }

            // Add left child to the queue with horizontal distance - 1
            if (node.left != null) {
                queue.add(new QueueNode(node.left, hd - 1));
            }

            // Add right child to the queue with horizontal distance + 1
            if (node.right != null) {
                queue.add(new QueueNode(node.right, hd + 1));
            }
        }

        // Print the top view nodes from the map
        for (int i : map.values()) {
            System.out.print(i + " ");
        }
    }
    // FOR BOTTOM VIEW , DONT CHECK IF HD EXISTS OR NOT , JUST UPDATE THE LATEST ONE

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);

        return 1 + Math.max(l, r);
    }

    public static boolean balance_help(Node root) {
        int a = check_balance(root);
        if (a == -1) {
            return false;
        }
        return true;
    }

    public static int check_balance(Node root) {
        if (root == null) {
            return 0;
        }
        int l = check_balance(root.left);
        int r = check_balance(root.right);

        if (Math.abs(l - r) > 1 || l == -1 || r == -1) {
            return -1;
        }

        return 1 + Math.max(l, r);
    }

    public static int maxPathSum(Node root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    public static int maxPathDown(Node root, int maxValue[]) {
        if (root == null)
            return 0;
        int left = Math.max(0, maxPathDown(root.left, maxValue));
        int right = Math.max(0, maxPathDown(root.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + root.data);
        return Math.max(left, right) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(35);
        root.right = new Node(57);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right.left = new Node(52);
        root.right.right = new Node(58);
        root.left.left.left = new Node(11);

        System.out.print("INORDER : ");
        inorder(root);
        System.out.println();

        System.out.print("PREORDER : ");
        preorder(root);
        System.out.println();

        System.out.print("POSTORDER : ");
        postorder(root);
        System.out.println();

        System.out.print("LEVEL ORDER : ");
        level_order(root);
        System.out.println();

        System.out.print("HEIGHT : " + height(root));

        System.out.println("\n" + balance_help(root));

        System.out.println("Max path value : " + maxPathSum(root));

        System.out.println("ZIGZAG ORDER : ");
        zigzag(root);

        System.out.println("RIGHT SIDE VIEW : ");
        right_view(root);

        System.out.println("\nLEFT SIDE VIEW : ");
        left_view(root);

        System.out.println("\nTOP SIDE VIEW : ");
        top_view(root);
    }
}

// right side view
// 50 57 58 11

// left side view
// 50 35 30 11

// top view
// 11 30 35 50 57 58

// bottom view
// 11 30 40 52 58

// longest path