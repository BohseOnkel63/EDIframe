package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6140  Width dimension  n..15
 * Width of pieces or packages stated for transport purposes.
 */
public class E6140 extends Element {

    public E6140() {
        this(null);
    }

    public E6140(String Content) {
        super("6140", "Width dimension", "n..15", "Width of pieces or packages stated for transport purposes.", "");
        this.setContent(Content);
    }
}

