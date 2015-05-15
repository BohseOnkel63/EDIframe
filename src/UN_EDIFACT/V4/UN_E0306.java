package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0306  Transaction control reference  an..35
 * A reference assigned by the transaction initiator.
 */
public class UN_E0306 extends Element {

    public UN_E0306() {
        this(null);
    }

    public UN_E0306(String Content) {
        super("0306", "Transaction control reference", "an..35", "A reference assigned by the transaction initiator.");
        this.setContent(Content);
    }
}

