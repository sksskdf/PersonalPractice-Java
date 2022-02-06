package OOP.constructorthis;

public class DogEx {
	public static void main(String[] args) {
		Dog choco = new Dog("choco");
		System.out.println("클래스 이름 : " + choco.getClass());
		System.out.println("객체 정보 : " + choco.toString());
		choco.sit();
		String eat = choco.eat("사료","간식");
		System.out.println(choco.name+"가 먹은것 : "+eat);
	}
}
