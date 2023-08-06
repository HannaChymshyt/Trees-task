package application;

class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

    }

    BinaryTree() {
        root = null;
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(" " + node.key);
            inOrderTraversal(node.right);
        }
    }

}
