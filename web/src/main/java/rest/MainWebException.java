package rest;

/**
 * Created by Vallen on 27.04.2016.
 */
public class MainWebException extends Exception {

    /**
     * Generated SerialUID.
     */
    private static final long serialVersionUID = -212838932741996474L;

    /**
     * Default constructor.
     */
    public MainWebException() {
    }

    /**
     * Public constructor.
     *
     * @param message
     * exception message
     */
    public MainWebException(final String message) {
        super(message);
    }

    /**
     * Public constructor.
     *
     * @param cause
     * exception cause
     */
    public MainWebException(final Throwable cause) {
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
    public MainWebException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
