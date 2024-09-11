package t17_Generic;

public class Test2VO {
	private String name;
	private int age;	
	private boolean gender;	
	private int su;
  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	
	@Override  //toString
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", su=" + su + "]";
	}	
}
