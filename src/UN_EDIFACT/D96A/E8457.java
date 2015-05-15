package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8457  Excess transportation reason, coded  an..3
 * Indication of reason for excess transportation.
 */
public class E8457 extends Element {

    public E8457() {
        this(null);
    }

    public E8457(String Content) {
        super("8457", "Excess transportation reason, coded", "an..3", "Indication of reason for excess transportation.", "");
        this.setContent(Content);
    }
}

