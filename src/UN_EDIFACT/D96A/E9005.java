package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9005  Employment category, coded  an..3
 * Identification of the employment category.
 */
public class E9005 extends Element {

    public E9005() {
        this(null);
    }

    public E9005(String Content) {
        super("9005", "Employment category, coded", "an..3", "Identification of the employment category.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

