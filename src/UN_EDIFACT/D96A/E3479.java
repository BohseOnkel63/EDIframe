package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3479  Marital status, coded  an..3
 * Code giving the marital status of a person.
 */
public class E3479 extends Element {

    public E3479() {
        this(null);
    }

    public E3479(String Content) {
        super("3479", "Marital status, coded", "an..3", "Code giving the marital status of a person.", "");
        this.setContent(Content);
    }
}

