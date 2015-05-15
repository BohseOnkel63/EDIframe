package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6314  Measurement value  n..18
 * Value of the measured unit.
 */
public class E6314 extends Element {

    public E6314() {
        this(null);
    }

    public E6314(String Content) {
        super("6314", "Measurement value", "n..18", "Value of the measured unit.", "");
        this.setContent(Content);
    }
}

