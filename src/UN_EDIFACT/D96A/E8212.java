package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8212  Id. of the means of transport  an..35
 * Identification of the means of transport by name or number.
 */
public class E8212 extends Element {

    public E8212() {
        this(null);
    }

    public E8212(String Content) {
        super("8212", "Id. of the means of transport", "an..35", "Identification of the means of transport by name or number.", "Use relevant code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

