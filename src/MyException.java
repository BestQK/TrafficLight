public class MyException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

	public String getMessage(){
		return super.getMessage();	
	}
}
