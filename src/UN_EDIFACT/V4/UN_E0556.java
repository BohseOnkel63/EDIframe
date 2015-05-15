package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0556  Length of data in octets of bits  n..18
 * A count of the data octets of bits.
 */
public class UN_E0556 extends Element {

    public UN_E0556() {
        this(null);
    }

    public UN_E0556(String Content) {
        super("0556", "Length of data in octets of bits", "n..18", "A count of the data octets of bits.");
        this.setContent(Content);
    }
}

