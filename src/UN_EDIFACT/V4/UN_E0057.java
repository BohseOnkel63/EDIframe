package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0057  Association assigned code  an..6
 * Code, assigned by the association responsible for the design and maintenance of the message type concerned, which further identifies the message.
 */
public class UN_E0057 extends Element {

    public UN_E0057() {
        this(null);
    }

    public UN_E0057(String Content) {
        super("0057", "Association assigned code", "an..6", "Code, assigned by the association responsible for the design and maintenance of the message type concerned, which further identifies the message.");
        this.setContent(Content);
    }
}

