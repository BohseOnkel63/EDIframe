package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3433  Institution name identification  an..11
 * Code identifying an institution.
 */
public class E3433 extends Element {

    public E3433() {
        this(null);
    }

    public E3433(String Content) {
        super("3433", "Institution name identification", "an..11", "Code identifying an institution.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

