package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5315  Remuneration type, coded  an..3
 * Remuneration type in coded form.
 */
public class E5315 extends Element {

    public E5315() {
        this(null);
    }

    public E5315(String Content) {
        super("5315", "Remuneration type, coded", "an..3", "Remuneration type in coded form.", "");
        this.setContent(Content);
    }
}

