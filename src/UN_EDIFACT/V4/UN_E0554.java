package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0554  Algorithm parameter value  an..512
 * Value of a parameter required by the algorithm.
 */
public class UN_E0554 extends Element {

    public UN_E0554() {
        this(null);
    }

    public UN_E0554(String Content) {
        super("0554", "Algorithm parameter value", "an..512", "Value of a parameter required by the algorithm.");
        this.setContent(Content);
    }
}

