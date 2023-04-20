package tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(1);
        binaryTree.add(5);
        binaryTree.add(8);
        binaryTree.add(6);
        binaryTree.add(2);
        binaryTree.remove(2);
        System.out.println(binaryTree.root);
    }
}
