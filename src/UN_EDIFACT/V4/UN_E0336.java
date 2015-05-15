package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0336  Time offset  n4
 * UTC (Universal Co-ordinated Time) offset from event time.
 */
public class UN_E0336 extends Element {

    public UN_E0336() {
        this(null);
    }

    public UN_E0336(String Content) {
        super("0336", "Time offset", "n4", "UTC (Universal Co-ordinated Time) offset from event time.");
        this.setContent(Content);
    }
}

