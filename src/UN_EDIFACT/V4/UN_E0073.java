package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0073  First and last transfer  a1
 * Indication used for the first and last message in a sequence of messages related to the same topic.
 */
public class UN_E0073 extends Element {

    public UN_E0073() {
        this(null);
    }

    public UN_E0073(String Content) {
        super("0073", "First and last transfer", "a1", "Indication used for the first and last message in a sequence of messages related to the same topic.");
        this.setContent(Content);
    }
}

