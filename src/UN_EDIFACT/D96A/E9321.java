package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9321  Application error identification  an..8
 * The code assigned by the receiver of a message to the identification of a data validation error condition.
 */
public class E9321 extends Element {

    public E9321() {
        this(null);
    }

    public E9321(String Content) {
        super("9321", "Application error identification", "an..8", "The code assigned by the receiver of a message to the identification of a data validation error condition.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

