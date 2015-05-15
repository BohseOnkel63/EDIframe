package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5420  Rate per unit  n..15
 * Rate per unit specified in the unit price basis.
 */
public class E5420 extends Element {

    public E5420() {
        this(null);
    }

    public E5420(String Content) {
        super("5420", "Rate per unit", "n..15", "Rate per unit specified in the unit price basis.", "");
        this.setContent(Content);
    }
}

