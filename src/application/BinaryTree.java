package application;

class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(7);
        tree.root.left = new Node(10);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(1);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(25);
        tree.root.left.left.left = new Node(14);
        tree.root.left.left.right = new Node(4);
        tree.root.left.right.left = new Node(18);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(20);


        System.out.print("\nInorder traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.print("\nPreorder traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.print("\nPostorder traversal: ");
        tree.postOrderTraversal(tree.root);

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

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(" " + node.key);
        }
    }
}
