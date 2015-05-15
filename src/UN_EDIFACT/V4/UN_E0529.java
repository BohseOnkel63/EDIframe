package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0529  Algorithm code list identifier  an..3
 * Specification of the code list used to identify the algorithm.
 */
public class UN_E0529 extends Element {

    public UN_E0529() {
        this(null);
    }

    public UN_E0529(String Content) {
        super("0529", "Algorithm code list identifier", "an..3", "Specification of the code list used to identify the algorithm.");
        this.setContent(Content);
    }
}

