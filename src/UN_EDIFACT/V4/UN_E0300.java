package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0300  Initiator control reference  an..35
 * A reference assigned by the dialogue initiator.
 */
public class UN_E0300 extends Element {

    public UN_E0300() {
        this(null);
    }

    public UN_E0300(String Content) {
        super("0300", "Initiator control reference", "an..35", "A reference assigned by the dialogue initiator.");
        this.setContent(Content);
    }
}

