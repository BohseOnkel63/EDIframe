package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3401  Name component status, coded  an..3
 * To specify the status of a name component.
 */
public class E3401 extends Element {

    public E3401() {
        this(null);
    }

    public E3401(String Content) {
        super("3401", "Name component status, coded", "an..3", "To specify the status of a name component.", "");
        this.setContent(Content);
    }
}

