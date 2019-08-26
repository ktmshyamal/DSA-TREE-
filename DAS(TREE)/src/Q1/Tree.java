package Q1;

public class Tree {
	
	public Node root;
	
	public Tree(){
		root = null;
	}
	
	public Node find(int emp){//find node with a fgiven key
		Node current = root;
		while(current.empNo != emp){
			if(emp<current.empNo){
				current = current.leftChild;
			}
			else{
				current = current.rightChild;
			}
			if(current == null){
				return null;
			}
		}
		return current;
	}
	
	
	public void insert(int Eno,String Name){
		Node newNode = new Node();//make new node
		newNode.empNo = Eno;
		newNode.name = Name;
		
		if(root == null){//no node in root
			root = newNode;
		}else{
			Node current = root;//start at root
			Node parent;
			
			while(true){//exists internally
				parent = current;
				if(Eno < current.empNo){//go to left
					current = current.leftChild;
					if(current == null){//if end of the line
						//insert on left
						parent.leftChild = newNode;
						return;
					}
				}//end if go left
				else{//or go right
					current = current.rightChild;
					if (current == null) {//if end of the line
						//insert on right
						parent.rightChild = newNode;
						return;
					}
				}//end else go right
			}//end while
		}//end else not root
	}//end insert
	
	public Node findRecursive(Node node,int emp){
		//node = root;
		if(node == null){
			return null;
		}
		//condition 1. we found value
		if(node.empNo == emp){
			System.out.println(node.name);
			return node;
		}
		
		//condition 2
		//value is less than node value.so go left sub tree
		else if(emp < node.empNo){
			return findRecursive(node.leftChild,emp);
		}
		
		//condition 3
		//value is greater than node value.so go right sub tree
		else{
			return findRecursive(node.rightChild,emp);
			
		}
	}
	
	public void inOrder(Node localroot){
		if (localroot != null){
			inOrder(localroot.leftChild);
			localroot.displayNode();
			inOrder(localroot.rightChild);
		}
	}
	
	public void preOrder(Node localroot)
	{
		if (localroot != null)
		{
			localroot.displayNode();
			preOrder(localroot.leftChild);
			preOrder(localroot.rightChild);
		}
	}	
	
	public void postOrder(Node localroot)
	{
		if (localroot != null)
		{
			postOrder(localroot.leftChild);
			postOrder(localroot.rightChild);
			localroot.displayNode();
		}
	}
	
	public void deleteAll(Node node){
		root = null;
	}


}
