package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8101  Transit direction, coded  an..3
 * Identification of the point of origin and point of direction.
 */
public class E8101 extends Element {

    public E8101() {
        this(null);
    }

    public E8101(String Content) {
        super("8101", "Transit direction, coded", "an..3", "Identification of the point of origin and point of direction.", "");
        this.setContent(Content);
    }
}

