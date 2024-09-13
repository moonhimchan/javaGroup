package t19_Databases.t03_Hoewon;

import java.util.ArrayList;
import java.util.Scanner;

public class HoewonService {
	Scanner scanner = new Scanner(System.in);
	HoewonVO vo = null;

	public void setInput(HoewonDAO dao) {
		String name, gender, joinday, address;
		int age;

		System.out.println("==> 회원 정보 등록하기");
		while(true) {
			System.out.println("성명 : "); name = scanner.next();
			// 동명2인 조회
			vo = dao.getSearch(name);
			if(vo.getName()==null) break;
			else System.out.println("같은 이름이 존재합니다. 다른 이름으로 등록하세요.");

		}

		System.out.println("나이 : "); age = scanner.nextInt();
		System.out.println("성별 : "); gender = scanner.next();
		System.out.println("가입일 : "); joinday = scanner.next();
		System.out.println("주소 : "); address = scanner.next();


		//HoewonDAO dao = new HoewonDAO();
		HoewonVO vo = new HoewonVO();

		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJoinday(joinday);
		vo.setAddress(address);


		//dao.setIuput(name, age, gender, joinday, address);
		int res=dao.setInput(vo);

		if(res != 0) System.out.println("회원 등록 완료!");
		else System.out.println("회원 등록 실패~");

		//dao.connClose();
	}

	// 전체검색 결과를 출력 VOS출력
	public void getList(HoewonDAO dao) {
		ArrayList<HoewonVO> vos = dao.getList();
		vo = new HoewonVO();
		//System.out.println("vos " +dao.getList());
		System.out.println("=====================================================");
		System.out.println("번호\t성명\t나이\t성별\t가입일\t\t주소");
		System.out.println("=====================================================");
		for(int i=0; i<vos.size(); i++) {
			vo = vos.get(i);
			System.out.print(vo.getIdx()+ "\t");
			System.out.print(vo.getName()+ "\t");
			System.out.print(vo.getAge()+ "\t");
			System.out.print(vo.getGender()+ "\t");
			System.out.print(vo.getJoinday().substring(0,10)+ "\t");
			System.out.print(vo.getAddress()+ "\n");
		}
		System.out.println("=====================================================");
		System.out.println("\t\t총 : " +vos.size() + " 건 ");
		System.out.println("=====================================================");
	}

	// 개별검색하여 결과를 출력
	public int getSerach(HoewonDAO dao,String name) {
		HoewonVO vo =dao.getSearch(name);

		if(vo.getName() != null) {
			System.out.println("=====================================================");
			System.out.println("번호\t성명\t나이\t성별\t가입일\t\t주소");
			System.out.println("=====================================================");
			System.out.print(vo.getIdx()+ "\t");
			System.out.print(vo.getName()+ "\t");
			System.out.print(vo.getAge()+ "\t");
			System.out.print(vo.getGender()+ "\t");
			System.out.print(vo.getJoinday().substring(0,10)+ "\t");
			System.out.print(vo.getAddress()+ "\n");
			return vo.getIdx();
		}
		else {
			System.out.println("검색한 자료가 없습니다.");
			return 0;
		}
	}

	// 회원자료 삭제처리
	public void setDelete(HoewonDAO dao,String name) {
		int res =dao.setDelete(name);

		if(res != 0) System.out.println("삭제 완료!!");
		else System.out.println("검색된 자료가 없습니다.");
	}

	// 회원자료 수정
	public void setUpdate(HoewonDAO dao, String name) {
		int idx = getSerach(dao, name);

		if(idx != 0) {
			int choice = 0; 
			String content ="";
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			while(true) {
				System.out.println("수정할 항목? 1.성명 2.나이 3.성별 4.가입일 5.주소==>");
				choice = scanner.nextInt();
				System.out.println("수정할 내용을 입력? ");
				content =scanner.next();
				if(choice == 1) {
					vo = dao.getSearch(content);
					if(vo.getName()==null) break;
					else System.out.println("같은 이름이 존재합니다. 다른 이름으로 수정하세요.");
				}
			}
			idx = dao.setUpdate(idx, choice, content);
			if(idx != 0) System.out.println("회원자료가 수정 되었습니다.");
			else System.out.println("회원자료 삭제 실패~~");
		}
	}

}



