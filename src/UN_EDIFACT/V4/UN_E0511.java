package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0511  Security party identification  an..512
 * Identification of a party involved in the security process, according to a defined registry of security parties.
 */
public class UN_E0511 extends Element {

    public UN_E0511() {
        this(null);
    }

    public UN_E0511(String Content) {
        super("0511", "Security party identification", "an..512", "Identification of a party involved in the security process, according to a defined registry of security parties.");
        this.setContent(Content);
    }
}

