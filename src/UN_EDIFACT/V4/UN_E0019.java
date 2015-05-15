package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0019  Time  n4
 * Local time of day when an interchange or a group was prepared.
 */
public class UN_E0019 extends Element {

    public UN_E0019() {
        this(null);
    }

    public UN_E0019(String Content) {
        super("0019", "Time", "n4", "Local time of day when an interchange or a group was prepared.");
        this.setContent(Content);
    }
}

