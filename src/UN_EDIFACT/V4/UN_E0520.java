package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0520  Security sequence number  an..35
 * Sequence number assigned to the EDIFACT structure to which security is applied.
 */
public class UN_E0520 extends Element {

    public UN_E0520() {
        this(null);
    }

    public UN_E0520(String Content) {
        super("0520", "Security sequence number", "an..35", "Sequence number assigned to the EDIFACT structure to which security is applied.");
        this.setContent(Content);
    }
}

