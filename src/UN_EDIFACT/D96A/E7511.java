package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7511  Type of marking, coded  an..3
 * To specify the type of marking that reflects the method and the conventions adhered to for marking.
 */
public class E7511 extends Element {

    public E7511() {
        this(null);
    }

    public E7511(String Content) {
        super("7511", "Type of marking, coded", "an..3", "To specify the type of marking that reflects the method and the conventions adhered to for marking.", "");
        this.setContent(Content);
    }
}

