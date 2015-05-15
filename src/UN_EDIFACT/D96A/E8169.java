package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8169  Full/empty indicator, coded  an..3
 * To indicate the extent to which the equipment is full or empty.
 */
public class E8169 extends Element {

    public E8169() {
        this(null);
    }

    public E8169(String Content) {
        super("8169", "Full/empty indicator, coded", "an..3", "To indicate the extent to which the equipment is full or empty.", "");
        this.setContent(Content);
    }
}

