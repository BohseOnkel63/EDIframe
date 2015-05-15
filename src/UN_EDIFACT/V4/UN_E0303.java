package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0303  Initiator reference identification  an..35
 * Organisation code or name assigned by the party that initiated the transaction or dialogue.
 */
public class UN_E0303 extends Element {

    public UN_E0303() {
        this(null);
    }

    public UN_E0303(String Content) {
        super("0303", "Initiator reference identification", "an..35", "Organisation code or name assigned by the party that initiated the transaction or dialogue.");
        this.setContent(Content);
    }
}

