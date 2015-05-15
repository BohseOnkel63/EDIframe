package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4295  Change reason, coded  an..3
 * Identification of the reason for a change.
 */
public class E4295 extends Element {

    public E4295() {
        this(null);
    }

    public E4295(String Content) {
        super("4295", "Change reason, coded", "an..3", "Identification of the reason for a change.", "");
        this.setContent(Content);
    }
}

