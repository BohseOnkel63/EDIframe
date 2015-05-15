package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4279  Payment terms type qualifier  an..3
 * Identification of the type of payment terms.
 */
public class E4279 extends Element {

    public E4279() {
        this(null);
    }

    public E4279(String Content) {
        super("4279", "Payment terms type qualifier", "an..3", "Identification of the type of payment terms.", "");
        this.setContent(Content);
    }
}

