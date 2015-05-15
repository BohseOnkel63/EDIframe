package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5245  Percentage qualifier  an..3
 * Identification of the usage of a percentage.
 */
public class E5245 extends Element {

    public E5245() {
        this(null);
    }

    public E5245(String Content) {
        super("5245", "Percentage qualifier", "an..3", "Identification of the usage of a percentage.", "");
        this.setContent(Content);
    }
}

