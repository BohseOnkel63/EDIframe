package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6321  Measurement significance, coded  an..3
 * Code specifying the significance of a measurement value.
 */
public class E6321 extends Element {

    public E6321() {
        this(null);
    }

    public E6321(String Content) {
        super("6321", "Measurement significance, coded", "an..3", "Code specifying the significance of a measurement value.", "");
        this.setContent(Content);
    }
}

