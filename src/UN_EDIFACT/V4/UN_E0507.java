package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0507  Original character set encoding, coded  an..3
 * Identification of the character set in which the secured EDIFACT structure was encoded when security mechanisms were applied.
 */
public class UN_E0507 extends Element {

    public UN_E0507() {
        this(null);
    }

    public UN_E0507(String Content) {
        super("0507", "Original character set encoding, coded", "an..3", "Identification of the character set in which the secured EDIFACT structure was encoded when security mechanisms were applied.");
        this.setContent(Content);
    }
}

