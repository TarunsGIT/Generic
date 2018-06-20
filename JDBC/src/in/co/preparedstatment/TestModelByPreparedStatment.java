package in.co.preparedstatment;

import in.co.javabean.CustomerDTO;

public class TestModelByPreparedStatment {

	public static final ModelByPreparedStatment MPSTMT = new ModelByPreparedStatment();
	public static CustomerDTO DTO = new CustomerDTO();

	public static void main(String[] args) {
		// updateCustomer();
		// deleteCustomer();
		findCustomerByPK();
		/*
		 * int i = 0; DTO.setFirstName("VISHAL"); DTO.setLastName("SIKKA");
		 * DTO.setCity("MYSORE"); DTO.setBalance(150000); i =
		 * MPSTMT.addCustomer(DTO);
		 * 
		 * if (i != 0) { System.out.println("RECORD INSERTED AT : " + i); } else
		 * { System.out.println("NOT INSETTED"); }
		 */

	}

	private static void findCustomerByPK() {
		int pk = 4;
		DTO = MPSTMT.findByPk(pk);
		if(DTO!=null){
			System.out.println(DTO.getFirstName());
			System.out.println(DTO.getLastName());
			System.out.println(DTO.getCity());
			System.out.println(DTO.getBalance());
			
		}else{
			System.out.println("RECORD NOT FOUND");
		}

	}

	private static void deleteCustomer() {
		DTO.setCustomer_ID(7);
		MPSTMT.deleteCustomer(DTO);

	}

	private static void updateCustomer() {

		DTO.setFirstName("SALIL");
		DTO.setLastName("PARIKH");
		DTO.setCity("BANGLORE");
		DTO.setBalance(200000);
		DTO.setCustomer_ID(7);
		MPSTMT.updateCustomer(DTO);

	}

}
