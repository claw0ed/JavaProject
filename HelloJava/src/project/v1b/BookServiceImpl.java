package project.v1b;

public class BookServiceImpl implements BookService{

	@Override
	public void addBook(BookV0 bk) {
		System.out.println("새로운 도서 데이터가 추가되었습니다");
	}

	@Override
	public String getBook() {
		String out = "도서 데이터를 출력 합니다";
		return out;
	}

	@Override
	public String getBook(String number) {
		System.out.printf("%s 도서가 조회 되었습니다 \n", number);
		return null;
	}

	@Override
	public String modifyBook(BookV0 bk) {
		System.out.printf("%s 데이터가 수정 되었습니다 \n", bk.getTitle());
		return null;
	}

	@Override
	public String removeBook(String number) {
		System.out.printf("%s 도서 데이터가 삭제 되었습니다 \n", number);
		return null;
	}

}
