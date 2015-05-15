package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0031  Acknowledgement request  n1
 * Code requesting acknowledgement for the interchange.
 */
public class UN_E0031 extends Element {

    public UN_E0031() {
        this(null);
    }

    public UN_E0031(String Content) {
        super("0031", "Acknowledgement request", "n1", "Code requesting acknowledgement for the interchange.");
        this.setContent(Content);
    }
}

