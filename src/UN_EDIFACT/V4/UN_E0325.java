package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0325  Duplicate Indicator  a1
 * Indication that the structure is a duplicate of a previously sent structure.
 */
public class UN_E0325 extends Element {

    public UN_E0325() {
        this(null);
    }

    public UN_E0325(String Content) {
        super("0325", "Duplicate Indicator", "a1", "Indication that the structure is a duplicate of a previously sent structure.");
        this.setContent(Content);
    }
}

