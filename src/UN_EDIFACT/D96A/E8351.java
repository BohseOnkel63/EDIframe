package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8351  Hazard code identification  an..7
 * Dangerous goods code.
 */
public class E8351 extends Element {

    public E8351() {
        this(null);
    }

    public E8351(String Content) {
        super("8351", "Hazard code identification", "an..7", "Dangerous goods code.", "Use relevant code list.");
        this.setContent(Content);
    }
}

