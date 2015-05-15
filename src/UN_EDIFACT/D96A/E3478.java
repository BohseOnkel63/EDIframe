package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3478  Marital status  an..35
 * Marital status of a person.
 */
public class E3478 extends Element {

    public E3478() {
        this(null);
    }

    public E3478(String Content) {
        super("3478", "Marital status", "an..35", "Marital status of a person.", "");
        this.setContent(Content);
    }
}

