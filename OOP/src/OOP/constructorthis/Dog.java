package OOP.constructorthis;

public class Dog {
	String kind;
	int age;
	String name;
	
	
	//this()�� �̿��� ������ �����ε�,�ߺ� ����
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
		System.out.println(name + "�� �ɾҴ�.");
	}
	
	String eat(String ... values) {
		String eat = "";
		for(int i=0; i<values.length; i++) {
			eat += values[i]+",";
		}
		return eat;
	}
	
}
