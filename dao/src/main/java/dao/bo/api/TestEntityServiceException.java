package dao.bo.api;

import dao.shared.MainDaoServiceException;

/**
 * {@link dao.shared.MainDaoService} Base Exception.
 *
 * @author Andrew Khilkevich
 */
public class TestEntityServiceException extends MainDaoServiceException {

    /**
     * Generated SerialUID.
     */
    private static final long serialVersionUID = -4045862699223072203L;

    /**
     * Public constructor.
     *
     * @param message
     * exception message
     */
    public TestEntityServiceException(final String message) {
        super(message);
    }

    /**
     * Public constructor.
     *
     * @param cause
     * exception cause
     */
    public TestEntityServiceException(final Throwable cause) {
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
    public TestEntityServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
