package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7007  Physical or logical state, coded  an..3
 * Code of the physical or logical state.
 */
public class E7007 extends Element {

    public E7007() {
        this(null);
    }

    public E7007(String Content) {
        super("7007", "Physical or logical state, coded", "an..3", "Code of the physical or logical state.", "");
        this.setContent(Content);
    }
}

