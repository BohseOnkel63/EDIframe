package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0515  Security party code list responsible agency, coded  an..3
 * Identification of the agency in charge of registration of the security parties.
 */
public class UN_E0515 extends Element {

    public UN_E0515() {
        this(null);
    }

    public UN_E0515(String Content) {
        super("0515", "Security party code list responsible agency, coded", "an..3", "Identification of the agency in charge of registration of the security parties.");
        this.setContent(Content);
    }
}

