package t10_abstract;

public class Cat extends Animal {
	public String talk="야옹";
	
	void sori() {
		
	}

	@Override
	public void sound() {
		System.out.println("고양이 울음소리는 "+talk+"~~~");
	}

}
