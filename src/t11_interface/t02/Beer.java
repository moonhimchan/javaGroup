package t11_interface.t02;

public class Beer implements Toy {
	private int age = 0;

	@Override
	public void age() {
		System.out.println("모든 연령대가 다 사용하실수 있습니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔/다리가 모두 움직일수 있습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void misaile() {}

	@Override
	public int possibleAge() {
		return age;
	}

	@Override
	public void product(String name) {
		System.out.println("장난감 이름 : " + name);
	}

}
