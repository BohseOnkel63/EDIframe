package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6168  Length dimension  n..15
 * Length of pieces or packages stated for transport purposes.
 */
public class E6168 extends Element {

    public E6168() {
        this(null);
    }

    public E6168(String Content) {
        super("6168", "Length dimension", "n..15", "Length of pieces or packages stated for transport purposes.", "");
        this.setContent(Content);
    }
}

