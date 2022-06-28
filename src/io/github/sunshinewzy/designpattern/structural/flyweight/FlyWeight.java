package io.github.sunshinewzy.designpattern.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyWeight {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(3, 4, TreeFactory.getTree("A", "1"));
		TreeNode b = new TreeNode(5, 4, TreeFactory.getTree("A", "1"));

		System.out.println(a.getTree());
		System.out.println(b.getTree());
	}
	
}


class TreeFactory {
	private static Map<String, Tree> map = new ConcurrentHashMap<>();
	
	
	public static Tree getTree(String name, String data) {
		if(map.containsKey(name)) {
			return map.get(name);
		}
		
		Tree tree = new Tree(name, data);
		map.put(name, tree);
		return tree;
	}
}


class TreeNode {
	private int x;
	private int y;
	private Tree tree;


	public TreeNode(int x, int y, Tree tree) {
		this.x = x;
		this.y = y;
		this.tree = tree;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Tree getTree() {
		return tree;
	}

	public void setTree(Tree tree) {
		this.tree = tree;
	}
}


class Tree {
	private final String name;
	private final String data;


	public Tree(String name, String data) {
		this.name = name;
		this.data = data;
	}


	public String getName() {
		return name;
	}

	public String getData() {
		return data;
	}

}
