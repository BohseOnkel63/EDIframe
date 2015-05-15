package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4424  Test reason  an..35
 * Reason for performing a test by name.
 */
public class E4424 extends Element {

    public E4424() {
        this(null);
    }

    public E4424(String Content) {
        super("4424", "Test reason", "an..35", "Reason for performing a test by name.", "");
        this.setContent(Content);
    }
}

