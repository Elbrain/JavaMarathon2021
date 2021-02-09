package day18;

public class Task3 {
    public static void main(String[] args) {
        Tree tree = new Tree(new Node(20));
        tree.insertNode(23);
        tree.insertNode(22);
        tree.insertNode(27);
        tree.insertNode(24);
        tree.insertNode(150);
        tree.insertNode(24);
        tree.insertNode(14);
        tree.insertNode(11);
        tree.insertNode(16);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(15);
        tree.insertNode(18);
        tree.dfs(tree.root);
    }
}