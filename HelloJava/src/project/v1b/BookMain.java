package project.v1b;

public class BookMain {

	public static void main(String[] args) {
		// 도서 프로그램 객체 생성
		BookService bksrv = new BookServiceImpl();
		
		// 도서 객체 생성
		BookV0 bk = new BookV0("1", "축구의 역사", "굿스포츠", 7000);
		
		// 도서 추가
		bksrv.addBook(bk);
		System.out.println(bk);
		
		// 도서 수정
		bk = new BookV0("1", "축구의 역사", "굿스포츠", 6000);
		bksrv.modifyBook(bk);
		
		// 도서 삭제
		bksrv.removeBook("축구의 역사");

	}

}
