package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0501  Security service, coded  an..3
 * Specification of the security service applied.
 */
public class UN_E0501 extends Element {

    public UN_E0501() {
        this(null);
    }

    public UN_E0501(String Content) {
        super("0501", "Security service, coded", "an..3", "Specification of the security service applied.");
        this.setContent(Content);
    }
}

