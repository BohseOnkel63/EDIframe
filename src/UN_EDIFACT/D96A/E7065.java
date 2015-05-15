package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7065  Type of packages identification  an..17
 * Coded description of the form in which goods are presented.
 */
public class E7065 extends Element {

    public E7065() {
        this(null);
    }

    public E7065(String Content) {
        super("7065", "Type of packages identification", "an..17", "Coded description of the form in which goods are presented.", "See UN/ECE Recommendation No. 21 (See Vol. II of UNTDED).  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

