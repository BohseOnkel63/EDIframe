package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0579  Key management function qualifier  an..3
 * Specification of the type of key management function.
 */
public class UN_E0579 extends Element {

    public UN_E0579() {
        this(null);
    }

    public UN_E0579(String Content) {
        super("0579", "Key management function qualifier", "an..3", "Specification of the type of key management function.");
        this.setContent(Content);
    }
}

