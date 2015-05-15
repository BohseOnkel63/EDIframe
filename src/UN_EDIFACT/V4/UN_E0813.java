package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0813  Reference qualifier  an..3
 * Code giving specific meaning to a reference identification number.
 */
public class UN_E0813 extends Element {

    public UN_E0813() {
        this(null);
    }

    public UN_E0813(String Content) {
        super("0813", "Reference qualifier", "an..3", "Code giving specific meaning to a reference identification number.");
        this.setContent(Content);
    }
}

