package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1159  Sequence number source, coded  an..3
 * Specification of the source for a specified sequence number in a coded form.
 */
public class E1159 extends Element {

    public E1159() {
        this(null);
    }

    public E1159(String Content) {
        super("1159", "Sequence number source, coded", "an..3", "Specification of the source for a specified sequence number in a coded form.", "May also be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

