package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0314  Event time  an..15
 * Time of event.
 */
public class UN_E0314 extends Element {

    public UN_E0314() {
        this(null);
    }

    public UN_E0314(String Content) {
        super("0314", "Event time", "an..15", "Time of event.");
        this.setContent(Content);
    }
}

