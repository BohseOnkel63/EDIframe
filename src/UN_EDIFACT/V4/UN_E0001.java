package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0001  Syntax identifier  a4
 * Coded identification of the agency controlling the syntax, and of the character repertoire used in an interchange.
 */
public class UN_E0001 extends Element {

    public UN_E0001() {
        this(null);
    }

    public UN_E0001(String Content) {
        super("0001", "Syntax identifier", "a4", "Coded identification of the agency controlling the syntax, and of the character repertoire used in an interchange.");
        this.setContent(Content);
    }
}

