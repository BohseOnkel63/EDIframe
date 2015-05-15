package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7083  Configuration, coded  an..3
 * Code indicating the status of the sub-line item in the configuration.
 */
public class E7083 extends Element {

    public E7083() {
        this(null);
    }

    public E7083(String Content) {
        super("7083", "Configuration, coded", "an..3", "Code indicating the status of the sub-line item in the configuration.", "");
        this.setContent(Content);
    }
}

