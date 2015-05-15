package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8335  Movement type, coded  an..3
 * Code indicating the type of movement.
 */
public class E8335 extends Element {

    public E8335() {
        this(null);
    }

    public E8335(String Content) {
        super("8335", "Movement type, coded", "an..3", "Code indicating the type of movement.", "");
        this.setContent(Content);
    }
}

