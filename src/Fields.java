
public class Fields {
	
	//Know how to read or write to object fields
	public String name;
	public int age;
	
	public Bier mijnBiertje;
	
			//field with a String and int
	Fields(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Fields(Bier rr){
		System.out.println("het is gelukt");
		mijnBiertje = rr;
	}

	public String getName() {
		return name;
	}
						//field with a String
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
						//field with a int
	public void setAge(int age) {
		this.age = age;
	}
	}


class Bier {
	
	
}
