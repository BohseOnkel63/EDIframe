package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7503  Damage area identification  an..4
 * Code specifying where the damage is on an object.
 */
public class E7503 extends Element {

    public E7503() {
        this(null);
    }

    public E7503(String Content) {
        super("7503", "Damage area identification", "an..4", "Code specifying where the damage is on an object.", "");
        this.setContent(Content);
    }
}

