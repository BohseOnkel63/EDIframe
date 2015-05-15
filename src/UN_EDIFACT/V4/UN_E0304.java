package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0304  Responder control reference  an..35
 * A reference assigned by the dialogue responder.
 */
public class UN_E0304 extends Element {

    public UN_E0304() {
        this(null);
    }

    public UN_E0304(String Content) {
        super("0304", "Responder control reference", "an..35", "A reference assigned by the dialogue responder.");
        this.setContent(Content);
    }
}

