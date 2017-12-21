package project.v1b;

public class CustomerMain {

	public static void main(String[] args) {
		// 고객 프로그램 객체 생성
		CustomerService cmsrv = new CustomerServiceImpl();
		
		// 고객 객체 생성
		CustomerV0 cm = new CustomerV0(1, "박지성", "810101-1010101", "영국 런던", "000-5000-0001");
		
		// 고객 추가
		cmsrv.addCustomer(cm);
		System.out.println(cm);
		
		// 고객 수정
		cm = new CustomerV0(1, "박지성", "810101-1010101", "영국 런던", "000-5000-4001");
		cmsrv.modifyCustomer(cm);
		
		// 고객 삭제
		cmsrv.removeCustomer("박지성");

	}

}
