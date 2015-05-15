package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0032  Interchange agreement identifier  an..35
 * Identification by name or code of the type of agreement under which the interchange takes place.
 */
public class UN_E0032 extends Element {

    public UN_E0032() {
        this(null);
    }

    public UN_E0032(String Content) {
        super("0032", "Interchange agreement identifier", "an..35", "Identification by name or code of the type of agreement under which the interchange takes place.");
        this.setContent(Content);
    }
}

