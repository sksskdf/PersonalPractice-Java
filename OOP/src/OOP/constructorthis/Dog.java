package OOP.constructorthis;

public class Dog {
	String kind;
	int age;
	String name;
	
	
	//this()를 이용한 생성자 오버로드,중복 제거
	Dog(String name){
		this("puddle",1,name);
	}
	
	Dog(String kind,int age,String name){
		this.kind=kind;
		this.age=age;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", age=" + age + ", name=" + name + "]";
	}
	
	void sit() {
		System.out.println(name + "은 앉았다.");
	}
	
	String eat(String ... values) {
		String eat = "";
		for(int i=0; i<values.length; i++) {
			eat += values[i]+",";
		}
		return eat;
	}
	
}
