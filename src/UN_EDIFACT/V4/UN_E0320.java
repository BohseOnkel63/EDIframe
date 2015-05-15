package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0320  Sender sequence number  n..6
 * Identification of the sequence number of the message or package within the sender interchange.
 */
public class UN_E0320 extends Element {

    public UN_E0320() {
        this(null);
    }

    public UN_E0320(String Content) {
        super("0320", "Sender sequence number", "n..6", "Identification of the sequence number of the message or package within the sender interchange.");
        this.setContent(Content);
    }
}

