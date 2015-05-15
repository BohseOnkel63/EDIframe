package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0311  Dialogue identification  an..14
 * Code identifying a dialogue.
 */
public class UN_E0311 extends Element {

    public UN_E0311() {
        this(null);
    }

    public UN_E0311(String Content) {
        super("0311", "Dialogue identification", "an..14", "Code identifying a dialogue.");
        this.setContent(Content);
    }
}

