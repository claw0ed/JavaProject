package project.v1b;

public interface BookService {
	
	void addBook(BookV0 bk); // 추가
	
	String getBook(); // 조회
	
	String getBook(String number); // 조회
	
	String modifyBook(BookV0 bk); // 수정
	
	String removeBook(String number); // 삭제
	
}
