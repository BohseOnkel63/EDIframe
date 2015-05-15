package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3131  Address type, coded  an..3
 * To specify the type of address.
 */
public class E3131 extends Element {

    public E3131() {
        this(null);
    }

    public E3131(String Content) {
        super("3131", "Address type, coded", "an..3", "To specify the type of address.", "");
        this.setContent(Content);
    }
}

