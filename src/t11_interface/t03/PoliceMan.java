package t11_interface.t03;

public class PoliceMan implements Action {

	@Override
	public void catching() {
		System.out.println("범인을 잡습니다.");
	}

	@Override
	public void search() {
		System.out.println("물건을 찾습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void rescue() {}

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}



}
