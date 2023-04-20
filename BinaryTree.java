package tree;

public class BinaryTree {
    Node root;
     private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data)
            current.left = addRecursive(current.left, data);
        else if (data > current.data)
            current.right = addRecursive(current.right, data);
        else
            return current;
        return current;
    }

    private Node removeRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int minValue = findMin(current.right);
            current.data = minValue;
            current.right = removeRecursive(current.right, minValue);
            return current;
        }

        if (data < current.data) {
            current.left = removeRecursive(current.left, data);
            return current;
        }
        current.right = removeRecursive(current.right, data);
        return current;
    }
    private int findMin(Node current) {
        if (current.left == null)
            return current.data;
        else
            findMin(current.left);
        return current.data;
    }

    public void add(int value) {
         root = addRecursive(root, value);
    }

    public void remove(int value) {
         removeRecursive(root, value);
    }

}
