package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0010  Interchange recipient identification  an..35
 * Name or coded identification of the recipient of the interchange.
 */
public class UN_E0010 extends Element {

    public UN_E0010() {
        this(null);
    }

    public UN_E0010(String Content) {
        super("0010", "Interchange recipient identification", "an..35", "Name or coded identification of the recipient of the interchange.");
        this.setContent(Content);
    }
}

