package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0035  Test indicator  n1
 * Indication that the structural level containing the test indicator is a test.
 */
public class UN_E0035 extends Element {

    public UN_E0035() {
        this(null);
    }

    public UN_E0035(String Content) {
        super("0035", "Test indicator", "n1", "Indication that the structural level containing the test indicator is a test.");
        this.setContent(Content);
    }
}

