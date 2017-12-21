package project.v1;

public class SungJukServiceImpl implements SungJukService {

	@Override
	public void addSungJuk(SungJukV0 sj) {
		System.out.println("새로운 성적 데이터가 추가되었습니다");
	}

	@Override
	public String getSungJuk() {
		String out = "성적 데이터를 출력 합니다";
		return out;
	}

	@Override
	public String getSungJuk(String name) {
		System.out.printf("%s 성적이 조회 되었습니다 \n", name);
		return name;
	}

	@Override
	public String modifySungJuk(SungJukV0 sj) {
		System.out.printf("%s 성적 데이터가 수정 되었습니다 \n", sj.getName());
		return null;
	}

	@Override
	public String removeSungJuk(String name) {
		System.out.printf("%s 성적 데이터가 삭제 되었습니다 \n", name);
		return null;
	}

}
