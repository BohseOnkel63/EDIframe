package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0083  Action, coded  an..3
 * A code indicating acknowledgement, or rejection (the action taken) of a subject interchange, or part of the subject interchange, or indication of interchange receipt.
 */
public class UN_E0083 extends Element {

    public UN_E0083() {
        this(null);
    }

    public UN_E0083(String Content) {
        super("0083", "Action, coded", "an..3", "A code indicating acknowledgement, or rejection (the action taken) of a subject interchange, or part of the subject interchange, or indication of interchange receipt.");
        this.setContent(Content);
    }
}

