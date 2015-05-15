/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT;

/**
 *
 * @author mannelini
 */
public class ValidityException extends Exception {

    /**
     *
     */
    public ValidityException() {
    }

    /**
     *
     * @param message
     */
    public ValidityException(String message) {
        super(message);
    }

    /**
     *
     * @param message
     * @param cause
     */
    public ValidityException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     *
     * @param cause
     */
    public ValidityException(Throwable cause) {
        super(cause);
    }

    /**
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public ValidityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
