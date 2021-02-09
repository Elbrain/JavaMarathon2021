package day18;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
    public void printNode(){
        System.out.println("Node: " + value + ", LeftChild: " + this.getLeftChild() + ", RightChild: " + this.getRightChild());
    }

    @Override
    public String toString() {
        return value + "";
    }
}
