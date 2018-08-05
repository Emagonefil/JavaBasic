
public class Tree {

	private Node root;
	

	// add note
	public void addNode(int data) {
		if (root == null) {
			root = new Node(data);
		}else {
			root.addNode(data);
		}
	}

	// out put nodes
	public void printNode() {
		if (root != null){
			root.printNode();
		}

	}
	
	
	
	
	

	public class Node {
		private int data;// 当前节点数据
		private Node left;
		private Node right;
		
		//constructor
		public Node(int data) {
			this.data = data;
		}
		
		public void addNode(int data) {
			if(this.data > data){
				if(this.left == null) {
//					this.left = data;
					this.left = new Node(data);
				}else{
					//recursion
					this.left.addNode(data);
				}
			}else if (this.data  <= data){
				if(this.right == null){
					this.right = new Node(data);
				}else{
					this.right.addNode(data);
				}
					
			}
			
		}
		
		public void printNode() {
			//输出节点，中序遍历，左根右
			if(this.left != null){
				this.left.printNode();
			}
			System.out.print(this.data + ",");//根
			if(this.right != null) {
				this.right.printNode();
			}
			/*
			 * 中序遍历更有意义，树从可以从小到大排列
			 * 
			 * 先序，根左右
			 * 
			 * System.out.println(this.data + ",");
			 * 	if(this.left != null){
				this.left.printNode();
				}
				if(this.right != null) {
				this.right.printNode();
				}
				
			   后序，左右根
			   if(this.left != null){
				this.left.printNode();
				}
				if(this.right != null) {
				this.right.printNode();
				}
				System.out.println(this.data + ",");
			 * */
			
		}
	}

}
