package BaiTap;

class Node {
	public Node left, right;
	public int nd;
	public void NodeTrue(int x) {
		int nd = x;
		left = right = null;
	}
	public void printNut() {
		System.out.printf(nd + " ");
	}
}
