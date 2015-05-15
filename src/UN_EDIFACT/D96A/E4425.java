package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4425  Test reason identification  an..17
 * Reason for performing a test by code.
 */
public class E4425 extends Element {

    public E4425() {
        this(null);
    }

    public E4425(String Content) {
        super("4425", "Test reason identification", "an..17", "Reason for performing a test by code.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

