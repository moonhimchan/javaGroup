package t15_API.t01.Object;

//toString
public class Test2VO {
	private String name;
	private int age;
	private boolean gender;	
	private String job;	
	private String address;

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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address=" + address
				+ "]";
	}  //source창에서 tostring자동으로 완성할수가 있다.
	
//	@Override
//	public String toString() { //toString은 object에서 상속받음
//		return "Test2 [name="+name+",age="+age+",gender="+gender+",job="+job+",address="+address+"]";
//	}
}
