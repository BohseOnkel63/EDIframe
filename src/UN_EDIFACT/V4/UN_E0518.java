package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0518  Encryption reference number  an..35
 * Reference number to the encrypted EDIFACT structure.
 */
public class UN_E0518 extends Element {

    public UN_E0518() {
        this(null);
    }

    public UN_E0518(String Content) {
        super("0518", "Encryption reference number", "an..35", "Reference number to the encrypted EDIFACT structure.");
        this.setContent(Content);
    }
}

