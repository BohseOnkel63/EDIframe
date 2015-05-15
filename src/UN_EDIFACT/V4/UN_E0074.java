package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0074  Number of segments in a message  n..10
 * The number of segments in a message body, plus the message header segment and message trailer segment.
 */
public class UN_E0074 extends Element {

    public UN_E0074() {
        this(null);
    }

    public UN_E0074(String Content) {
        super("0074", "Number of segments in a message", "n..10", "The number of segments in a message body, plus the message header segment and message trailer segment.");
        this.setContent(Content);
    }
}

