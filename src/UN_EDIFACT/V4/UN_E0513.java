package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0513  Security party code list qualifier  an..3
 * Identification of the type of identification used to register the security parties.
 */
public class UN_E0513 extends Element {

    public UN_E0513() {
        this(null);
    }

    public UN_E0513(String Content) {
        super("0513", "Security party code list qualifier", "an..3", "Identification of the type of identification used to register the security parties.");
        this.setContent(Content);
    }
}

