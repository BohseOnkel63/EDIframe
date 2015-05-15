package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0531  Algorithm parameter qualifier  an..3
 * Specification of the type of parameter value.
 */
public class UN_E0531 extends Element {

    public UN_E0531() {
        this(null);
    }

    public UN_E0531(String Content) {
        super("0531", "Algorithm parameter qualifier", "an..3", "Specification of the type of parameter value.");
        this.setContent(Content);
    }
}

