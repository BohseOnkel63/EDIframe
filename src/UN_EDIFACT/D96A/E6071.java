package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6071  Frequency qualifier  an..3
 * Indication of the application of a frequency.
 */
public class E6071 extends Element {

    public E6071() {
        this(null);
    }

    public E6071(String Content) {
        super("6071", "Frequency qualifier", "an..3", "Indication of the application of a frequency.", "");
        this.setContent(Content);
    }
}

