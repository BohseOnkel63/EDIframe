package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5049  Contribution type, coded  an..3
 * Identification of the type of a contribution to a scheme or group.
 */
public class E5049 extends Element {

    public E5049() {
        this(null);
    }

    public E5049(String Content) {
        super("5049", "Contribution type, coded", "an..3", "Identification of the type of a contribution to a scheme or group.", "");
        this.setContent(Content);
    }
}

