package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0577  Security party qualifier  an..3
 * Identification of the role of the security party.
 */
public class UN_E0577 extends Element {

    public UN_E0577() {
        this(null);
    }

    public UN_E0577(String Content) {
        super("0577", "Security party qualifier", "an..3", "Identification of the role of the security party.");
        this.setContent(Content);
    }
}

