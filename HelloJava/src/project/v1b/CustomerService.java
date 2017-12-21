package project.v1b;

public interface CustomerService {
	
	void addCustomer(CustomerV0 ct); // 추가
	
	String getCustomer(); // 조회
	
	String getCustomer(String custno); // 조회
	
	String modifyCustomer(CustomerV0 ct); // 수정
	
	String removeCustomer(String custno); // 삭제
	
}
