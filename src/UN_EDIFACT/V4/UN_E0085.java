package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0085  Syntax error, coded  an..3
 * A code indicating the error detected.
 */
public class UN_E0085 extends Element {

    public UN_E0085() {
        this(null);
    }

    public UN_E0085(String Content) {
        super("0085", "Syntax error, coded", "an..3", "A code indicating the error detected.");
        this.setContent(Content);
    }
}

