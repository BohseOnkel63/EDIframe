package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3299  Address purpose, coded  an..3
 * To specify the purpose of the address.
 */
public class E3299 extends Element {

    public E3299() {
        this(null);
    }

    public E3299(String Content) {
        super("3299", "Address purpose, coded", "an..3", "To specify the purpose of the address.", "");
        this.setContent(Content);
    }
}

