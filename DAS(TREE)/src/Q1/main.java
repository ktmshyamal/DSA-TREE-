package Q1;

public class main {

	public static void main(String[] args) {
		
		Tree T1 = new Tree();
		T1.insert(149, "Bob");
		//10 nodes
		
		T1.inOrder(T1.root);
		System.out.println(" ");

		T1.preOrder(T1.root);
		System.out.println(" ");

		T1.postOrder(T1.root);
		System.out.println(" ");
		
		
		T1.find(149);
		T1.findRecursive(T1.root, 149);
	}

}
