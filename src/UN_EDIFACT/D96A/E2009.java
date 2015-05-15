package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2009  Time relation, coded  an..3
 * Code relating payment terms to a time before, on or after the reference date.
 */
public class E2009 extends Element {

    public E2009() {
        this(null);
    }

    public E2009(String Content) {
        super("2009", "Time relation, coded", "an..3", "Code relating payment terms to a time before, on or after the reference date.", "");
        this.setContent(Content);
    }
}

