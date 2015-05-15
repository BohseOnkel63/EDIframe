package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6173  Size qualifier  an..3
 * Indication of the type or application of a size.
 */
public class E6173 extends Element {

    public E6173() {
        this(null);
    }

    public E6173(String Content) {
        super("6173", "Size qualifier", "an..3", "Indication of the type or application of a size.", "");
        this.setContent(Content);
    }
}

