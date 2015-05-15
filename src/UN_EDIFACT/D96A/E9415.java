package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9415  Government agency, coded  an..3
 * To indicate government agencies that are involved.
 */
public class E9415 extends Element {

    public E9415() {
        this(null);
    }

    public E9415(String Content) {
        super("9415", "Government agency, coded", "an..3", "To indicate government agencies that are involved.", "");
        this.setContent(Content);
    }
}

