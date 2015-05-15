package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0020  Interchange control reference  an..14
 * Unique reference assigned by the sender to an interchange.
 */
public class UN_E0020 extends Element {

    public UN_E0020() {
        this(null);
    }

    public UN_E0020(String Content) {
        super("0020", "Interchange control reference", "an..14", "Unique reference assigned by the sender to an interchange.");
        this.setContent(Content);
    }
}

