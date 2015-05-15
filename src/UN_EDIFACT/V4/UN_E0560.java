package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0560  Validation value  an..512
 * Security result corresponding to the security function specified.
 */
public class UN_E0560 extends Element {

    public UN_E0560() {
        this(null);
    }

    public UN_E0560(String Content) {
        super("0560", "Validation value", "an..512", "Security result corresponding to the security function specified.");
        this.setContent(Content);
    }
}

