package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7293  Sector/subject identification qualifier  an..3
 * Identification of the subject areas to which the specified conditions apply.
 */
public class E7293 extends Element {

    public E7293() {
        this(null);
    }

    public E7293(String Content) {
        super("7293", "Sector/subject identification qualifier", "an..3", "Identification of the subject areas to which the specified conditions apply.", "");
        this.setContent(Content);
    }
}

