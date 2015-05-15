package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7365  Processing indicator, coded  an..3
 * Identifies the value to be attributed to indicators required by the processing system.
 */
public class E7365 extends Element {

    public E7365() {
        this(null);
    }

    public E7365(String Content) {
        super("7365", "Processing indicator, coded", "an..3", "Identifies the value to be attributed to indicators required by the processing system.", "If national codes needed, use 1131 and 3055.");
        this.setContent(Content);
    }
}

