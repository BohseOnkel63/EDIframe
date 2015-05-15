package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0060  Group control count  n..6
 * The number of messages and packages in the group.
 */
public class UN_E0060 extends Element {

    public UN_E0060() {
        this(null);
    }

    public UN_E0060(String Content) {
        super("0060", "Group control count", "n..6", "The number of messages and packages in the group.");
        this.setContent(Content);
    }
}

