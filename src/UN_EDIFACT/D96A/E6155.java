package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6155  Measurement attribute, coded  an..3
 * Code used to specify non-discrete measurement values.
 */
public class E6155 extends Element {

    public E6155() {
        this(null);
    }

    public E6155(String Content) {
        super("6155", "Measurement attribute, coded", "an..3", "Code used to specify non-discrete measurement values.", "");
        this.setContent(Content);
    }
}

