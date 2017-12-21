package project.v1b;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void addCustomer(CustomerV0 ct) {
		System.out.println("새로운 고객 데이터가 추가되었습니다");
	}

	@Override
	public String getCustomer() {
		String out = "고객 데이터를 출력 합니다";
		return out;
	}

	@Override
	public String getCustomer(String custno) {
		System.out.printf("%s 고객이 조회 되었습니다 \n", custno);
		return null;
	}

	@Override
	public String modifyCustomer(CustomerV0 ct) {
		System.out.printf("%s 고객 데이터가 수정 되었습니다 \n", ct.getName());
		return null;
	}

	@Override
	public String removeCustomer(String custno) {
		System.out.printf("%s 고객 데이터가 삭제 되었습니다 \n", custno);
		return null;
	}
	
}
