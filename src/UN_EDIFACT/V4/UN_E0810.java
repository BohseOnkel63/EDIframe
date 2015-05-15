package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0810  Length of object in octets of bits  n..18
 * Count of the number of octets of bits in the object.
 */
public class UN_E0810 extends Element {

    public UN_E0810() {
        this(null);
    }

    public UN_E0810(String Content) {
        super("0810", "Length of object in octets of bits", "n..18", "Count of the number of octets of bits in the object.");
        this.setContent(Content);
    }
}

