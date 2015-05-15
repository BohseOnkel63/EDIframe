package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5419  Rate type qualifier  an..3
 * Identification of the type of rate.
 */
public class E5419 extends Element {

    public E5419() {
        this(null);
    }

    public E5419(String Content) {
        super("5419", "Rate type qualifier", "an..3", "Identification of the type of rate.", "");
        this.setContent(Content);
    }
}

