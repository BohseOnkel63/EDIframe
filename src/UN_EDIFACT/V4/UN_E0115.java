package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0115  Message subset identification  an..14
 * Coded identification of a message subset, assigned by its controlling agency.
 */
public class UN_E0115 extends Element {

    public UN_E0115() {
        this(null);
    }

    public UN_E0115(String Content) {
        super("0115", "Message subset identification", "an..14", "Coded identification of a message subset, assigned by its controlling agency.");
        this.setContent(Content);
    }
}

