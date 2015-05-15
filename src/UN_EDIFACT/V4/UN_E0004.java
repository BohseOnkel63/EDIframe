package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0004  Interchange sender identification  an..35
 * Name or coded identification of the sender of the interchange.
 */
public class UN_E0004 extends Element {

    public UN_E0004() {
        this(null);
    }

    public UN_E0004(String Content) {
        super("0004", "Interchange sender identification", "an..35", "Name or coded identification of the sender of the interchange.");
        this.setContent(Content);
    }
}

