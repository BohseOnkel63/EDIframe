package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7361  Customs code identification  an..18
 * To specify goods in terms of customs identity.
 */
public class E7361 extends Element {

    public E7361() {
        this(null);
    }

    public E7361(String Content) {
        super("7361", "Customs code identification", "an..18", "To specify goods in terms of customs identity.", "Use relevant code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

