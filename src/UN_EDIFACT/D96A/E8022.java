package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8022  Freight and charges  an..26
 * Plain language statement describing freight and other charges.
 */
public class E8022 extends Element {

    public E8022() {
        this(null);
    }

    public E8022(String Content) {
        super("8022", "Freight and charges", "an..26", "Plain language statement describing freight and other charges.", "");
        this.setContent(Content);
    }
}

