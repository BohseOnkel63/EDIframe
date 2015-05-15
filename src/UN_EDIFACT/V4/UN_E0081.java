package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0081  Section identification  a1
 * Identification of the separation of sections of a message.
 */
public class UN_E0081 extends Element {

    public UN_E0081() {
        this(null);
    }

    public UN_E0081(String Content) {
        super("0081", "Section identification", "a1", "Identification of the separation of sections of a message.");
        this.setContent(Content);
    }
}

