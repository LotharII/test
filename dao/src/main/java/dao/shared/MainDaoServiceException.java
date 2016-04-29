package dao.shared;

/**
 * Base Exception for DAO Services.
 *
 * @author Andrew Khilkevich
 */
public class MainDaoServiceException extends Exception {

    /**
     * Basic serialVersionUID variable.
     */
    private static final long serialVersionUID = -9127249888998736094L;


    /**
     * Default constructor.
     */
    public MainDaoServiceException() {
    }

    /**
     * Public constructor.
     *
     * @param message
     * exception message
     */
    public MainDaoServiceException(final String message) {
        super(message);
    }

    /**
     * Public constructor.
     *
     * @param cause
     * exception cause
     */
    public MainDaoServiceException(final Throwable cause) {
        super(cause);
    }

    /**
     * Public constructor.
     *
     * @param message
     * exception message
     * @param cause
     * exception cause
     */
    public MainDaoServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
