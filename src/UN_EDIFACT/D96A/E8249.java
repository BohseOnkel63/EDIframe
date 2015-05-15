package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8249  Equipment status, coded  an..3
 * Indication of the action related to the equipment.
 */
public class E8249 extends Element {

    public E8249() {
        this(null);
    }

    public E8249(String Content) {
        super("8249", "Equipment status, coded", "an..3", "Indication of the action related to the equipment.", "");
        this.setContent(Content);
    }
}

