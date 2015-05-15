package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0575  List parameter qualifier  an..3
 * Specification of the type of list parameter.
 */
public class UN_E0575 extends Element {

    public UN_E0575() {
        this(null);
    }

    public UN_E0575(String Content) {
        super("0575", "List parameter qualifier", "an..3", "Specification of the type of list parameter.");
        this.setContent(Content);
    }
}

