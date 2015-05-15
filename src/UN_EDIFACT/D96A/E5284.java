package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5284  Unit price basis  n..9
 * Basis on which the unit price/rate applies.
 */
public class E5284 extends Element {

    public E5284() {
        this(null);
    }

    public E5284(String Content) {
        super("5284", "Unit price basis", "n..9", "Basis on which the unit price/rate applies.", "");
        this.setContent(Content);
    }
}

