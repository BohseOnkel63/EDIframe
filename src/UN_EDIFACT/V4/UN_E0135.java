package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0135  Service segment tag, coded  an..3
 * Code identifying a service segment.
 */
public class UN_E0135 extends Element {

    public UN_E0135() {
        this(null);
    }

    public UN_E0135(String Content) {
        super("0135", "Service segment tag, coded", "an..3", "Code identifying a service segment.");
        this.setContent(Content);
    }
}

