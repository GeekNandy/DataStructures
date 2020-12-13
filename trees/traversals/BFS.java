/**
 * 
 */
package trees.traversals;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Sharad
 *
 */

class Node {
	
	int data;
	Node left, right;
	
	Node(int data) {
		this.data = data;
		left = right = null;
	}
	
	Node() {
		data = 0;
		left = right = null;
	}
	
}

public class BFS {
	
	static void BFStraversal(Node root) {
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		while(!q.isEmpty()) {
			Node n = q.peek();
			q.poll();
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
			System.out.print(n.data+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Node graph = new Node(); // root node		
		graph.left = new Node(1);
		graph.right = new Node(3);
		(graph.left).left = new Node(4);
		(graph.left).right = new Node(2);
		
		BFStraversal(graph);
	}

}
