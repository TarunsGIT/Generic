package in.co.statment;

public class TestModelByStatment {

	public static ModelByStatment model = new ModelByStatment();

	public static void main(String[] args) {
		// long i = model.addCustomer();
		/*
		 * if (i != 0) { System.out.println("RECORD ADDED AT " + i); }
		 */

		/*
		 * long i = model.updateCustomer(); if (i != 0) {
		 * System.out.println("RECORD UPDATED AT " + i); }
		 */

		/*long i = model.deleteCustomer();
		if (i > 0) {
			System.out.println("RECORD DELETED " + i);
		}else{
			System.out.println("NOT DELETED");
		}*/
		
		model.getCustomer();
	}

}
