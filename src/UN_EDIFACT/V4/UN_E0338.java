package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0338  Event date  n..8
 * Date of event.
 */
public class UN_E0338 extends Element {

    public UN_E0338() {
        this(null);
    }

    public UN_E0338(String Content) {
        super("0338", "Event date", "n..8", "Date of event.");
        this.setContent(Content);
    }
}

