package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0036  Interchange control count  n..6
 * The number of messages and packages in an interchange or, if used, the number of groups in an interchange.
 */
public class UN_E0036 extends Element {

    public UN_E0036() {
        this(null);
    }

    public UN_E0036(String Content) {
        super("0036", "Interchange control count", "n..6", "The number of messages and packages in an interchange or, if used, the number of groups in an interchange.");
        this.setContent(Content);
    }
}

