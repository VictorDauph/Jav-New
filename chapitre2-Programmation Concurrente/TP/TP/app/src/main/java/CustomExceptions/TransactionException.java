package CustomExceptions;

public class TransactionException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4323295462351762368L;

	public TransactionException(String message) {
        super(message);
    }
}
