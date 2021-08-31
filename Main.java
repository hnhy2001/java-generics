package oop;

public class Main {
	public static void main(String[] args) {
		List<String> stack = new StackList<>();
		stack.push("1");
		stack.push("2");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
