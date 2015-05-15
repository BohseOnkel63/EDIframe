package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0591  Padding mechanism, coded  an..3
 * Padding mechanism or padding scheme applied.
 */
public class UN_E0591 extends Element {

    public UN_E0591() {
        this(null);
    }

    public UN_E0591(String Content) {
        super("0591", "Padding mechanism, coded", "an..3", "Padding mechanism or padding scheme applied.");
        this.setContent(Content);
    }
}

