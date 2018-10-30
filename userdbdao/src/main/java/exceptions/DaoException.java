package exceptions;

public class DaoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DaoException(Throwable cause) {
		super("Errors occurred during DB access!", cause);
	}
}
