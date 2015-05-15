package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0022  Recipient reference/password  an..14
 * Reference or password to the recipient's system or to a third party network as specified in the partners' interchange agreement.
 */
public class UN_E0022 extends Element {

    public UN_E0022() {
        this(null);
    }

    public UN_E0022(String Content) {
        super("0022", "Recipient reference/password", "an..14", "Reference or password to the recipient's system or to a third party network as specified in the partners' interchange agreement.");
        this.setContent(Content);
    }
}

