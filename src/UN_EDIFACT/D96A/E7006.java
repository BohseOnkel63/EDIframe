package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7006  Physical or logical state  an..35
 * Description of the physical or logical state.
 */
public class E7006 extends Element {

    public E7006() {
        this(null);
    }

    public E7006(String Content) {
        super("7006", "Physical or logical state", "an..35", "Description of the physical or logical state.", "");
        this.setContent(Content);
    }
}

