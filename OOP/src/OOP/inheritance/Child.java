package OOP.inheritance;

public class Child extends Parent {
	public int c = 30;
	void display() {
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}
