package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9143  Relationship, coded  an..3
 * Identification of a relationship.
 */
public class E9143 extends Element {

    public E9143() {
        this(null);
    }

    public E9143(String Content) {
        super("9143", "Relationship, coded", "an..3", "Identification of a relationship.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

