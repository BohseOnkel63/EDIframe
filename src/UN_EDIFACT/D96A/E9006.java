package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9006  Qualification classification  an..35
 * Description of a qualification classification.
 */
public class E9006 extends Element {

    public E9006() {
        this(null);
    }

    public E9006(String Content) {
        super("9006", "Qualification classification", "an..35", "Description of a qualification classification.", "");
        this.setContent(Content);
    }
}

