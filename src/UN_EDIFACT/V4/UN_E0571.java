package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0571  Security error, coded  an..3
 * Identifies the security error causing the rejection of the EDIFACT structure.
 */
public class UN_E0571 extends Element {

    public UN_E0571() {
        this(null);
    }

    public UN_E0571(String Content) {
        super("0571", "Security error, coded", "an..3", "Identifies the security error causing the rejection of the EDIFACT structure.");
        this.setContent(Content);
    }
}

