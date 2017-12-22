package project.v2;

import project.v1.SungJukV0;

public interface SungJukService {
	// 성적 데이터 CRUD 처리 - 저장, 조회, 수정, 삭제
	
	void addSungJuk(SungJukV0 sj); // 추가
	
	String getSungJuk(); // 조회
	
	String getSungJuk(int no); // 번호로 조회
	
	String modifySungJuk(SungJukV0 sj, int no); // 번호로 조회 후  수정
	
	String removeSungJuk(int no); // 번호로 삭제
	
}
