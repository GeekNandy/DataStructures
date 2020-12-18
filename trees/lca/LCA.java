package trees.lca;

class Node {
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LCA {
	
	static boolean v1, v2;
	
	static Node findLCAUtil(Node node, int n1data, int n2data) {
		if(node!=null) {
			Node temp = null;
			
			if(node.data == n1data) {
				v1 = true;
				temp = node;
			}
			
			if(node.data == n2data) {
				v2 = true;
				temp = node;
			}
			
			Node leftLCA = findLCAUtil(node.left, n1data, n2data);
			Node rightLCA = findLCAUtil(node.right, n1data, n2data);
			
			if(temp!=null) return temp;
			
			if(leftLCA !=null && rightLCA !=null) return node;
			
			return (leftLCA!=null)?leftLCA:rightLCA;
		}
		return null;
	}
	
	static Node findLCA(Node node, int n1data, int n2data) {
		v1 = v2 = false;
		
		Node lca = findLCAUtil(node, n1data, n2data);
		
		return (v1 && v2)?(lca):(null);
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		(root.left).left = new Node(4);
		(root.left).right = new Node(5);
		(root.right).left = new Node(6);
		(root.right).right = new Node(7);
		
		Node lca = findLCA(root, 4, 5);
		System.out.println((lca!=null)?("LCA of entered node data is = "+lca.data)
				:"Given Key(s) absent in the tree");
		
		lca = findLCA(root, 4, 10);
		System.out.println((lca!=null)?("LCA of entered node data is = "+lca.data)
				:"Given Key(s) absent in the tree");
	}

}
