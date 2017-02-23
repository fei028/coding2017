package com.coding.mybasic;

public class BinaryTreeNode {
	
	private Object data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	public BinaryTreeNode insert(Object o){
		search(this,o);
		BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
		binaryTreeNode.setData(o);
		return null ;
	}
	private boolean isExistData(Object data) {
		return search(this,data) != null;
		
	}
	
	private BinaryTreeNode search(BinaryTreeNode binaryTreeNode, Object data) {
		if(binaryTreeNode == null){
			return null;
		}
		Object curNodeData = binaryTreeNode.data;
		if(curNodeData != null){// 左 curNodeData < data
			search(binaryTreeNode.left,data);
		}else if(curNodeData == null){
			search(binaryTreeNode.right,data);
		}
		return binaryTreeNode;
	}
	
}
