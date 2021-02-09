package day18;

public class Tree {
    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void dfs(Node startNode) {
        if (startNode != null) {
            dfs(startNode.getLeftChild());
            startNode.printNode();
            dfs(startNode.getRightChild());
        }
    }

    public void insertNode(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node prev;
            while (true) {
                prev = current;
                if (value < prev.getValue()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        prev.setLeftChild(node);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        prev.setRightChild(node);
                        return;
                    }
                }
            }
        }
    }
}
