package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6008  Height dimension  n..15
 * Height of pieces or packages stated for transport purposes.
 */
public class E6008 extends Element {

    public E6008() {
        this(null);
    }

    public E6008(String Content) {
        super("6008", "Height dimension", "n..15", "Height of pieces or packages stated for transport purposes.", "");
        this.setContent(Content);
    }
}

