package BaiTap;

public class BimarySearchTree {
	Node Root;
	public BimarySearchTree() {
		Node left = null;
		Node right = null;
	}
	//RNL
	public void printRNL(Node Root) {
		if(Root != null) {
			printLNR(Root.right);
			System.out.println(Root.nd + " ");
			printLNR(Root.left);
		}
	}
	//LNR
	public void printLNR(Node Root) {
		if(Root != null) {
			printLNR(Root.left);
			System.out.println(Root.nd + " ");
			printLNR(Root.right);
		}
	}
	//NRL
	public void printNRL(Node Root) {
		if(Root != null) {
			printNRL(Root.left);
			Root.printNut();
			printNRL(Root.right);
		}
	}
	//Tổng các giá trị
	public int sum(Node Root) {
		if(Root != null) 
			return Root.nd + sum(Root.left) + sum(Root.right);
		return 0;
	}
	//Đếm lẻ
	public int demLe(Node n) {
		if(Root != null) {
			if(Root.nd % 2 != 0)
				return 1 + demLe(Root.left) + demLe(Root.right);
			else
				return demLe(Root.left) + demLe(Root.right);
		}
		return 0;
	}
	//Nút chẵn chia hết cho 5
	public void inChan(Node n) {
		if(Root != null) {
			if((Root.nd % 2 == 0) && (Root.nd % 5 == 0))
				Root.printNut();
			printLNR(Root.right);
			printLNR(Root.left);
		}
	}
	//Đếm Lá
	public void demLa(Node n) {
		int dem = 0;
		if(Root != null) {
			
			dem++;
		
		}
	}
}
