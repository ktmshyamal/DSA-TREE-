package Q1;

public class Node {

	public int empNo;// key value data
	public String name;// other data
	public Node leftChild;// Right Child Node
	public Node rightChild;// Left Child Node

	public void displayNode() {
		System.out.println("{ " + empNo + " , " + name + " } ");
	}
	
	public Node(){
		leftChild = null;
		rightChild = null;
		empNo = 0;
	}
}
