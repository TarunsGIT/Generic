package in.co.exception;

public class ExceptionOver extends ExceptionOverride {

	public void start() {
		System.out.println("Child class:Start()");
	}

	public  void end() {
		System.out.println("Child class:End()");
	}

	public static void main(String[] args) {
		ExceptionOverride PCPI = new ExceptionOverride();
		PCPI.start();
		PCPI.end();
		System.out.println("\n"+"PCPI");
		ExceptionOver CCCI = new ExceptionOver();
		CCCI.start();
		CCCI.end();
		System.out.println("/n"+"CCCI");
		ExceptionOverride PCCI = new ExceptionOver();
		PCCI.start();
		PCCI.end();
		System.out.println("/n"+"PCCI");
		/*ExceptionOver CCPI = (ExceptionOver) new ExceptionOverride();
		CCPI.start();
		CCPI.end();*/

	}

}
