package project.v1;

public interface SungJukService {
	// 성적 데이터 CRUD 처리 - 저장, 조회, 수정, 삭제
	
	void addSungJuk(SungJukV0 sj); // 추가
	
	String getSungJuk(); // 조회
	
	String getSungJuk(String name); // 조회
	
	String modifySungJuk(SungJukV0 sj); // 수정
	
	String removeSungJuk(String name); // 삭제
	
}
