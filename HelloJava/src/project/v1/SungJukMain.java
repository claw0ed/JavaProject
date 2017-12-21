package project.v1;

public class SungJukMain {
	public static void main(String[] args) {
		// 성적 프로그램 객체 생성
		SungJukService sjsrv = new SungJukServiceImpl();
		
		// 성적 객체 생성
		SungJukV0 sj = new SungJukV0("혜교", 99, 98, 99);
		
		// 성적 추가
		sjsrv.addSungJuk(sj);
		
		// 성적 수정
		sj = new SungJukV0("혜교", 55, 87, 12);
		sjsrv.modifySungJuk(sj);
	
		// 성적 삭제
		sjsrv.removeSungJuk("혜교");
		
	}
}
