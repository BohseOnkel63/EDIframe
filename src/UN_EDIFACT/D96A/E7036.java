package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7036  Characteristic  an..35
 * Free form description of the product characteristic.
 */
public class E7036 extends Element {

    public E7036() {
        this(null);
    }

    public E7036(String Content) {
        super("7036", "Characteristic", "an..35", "Free form description of the product characteristic.", "");
        this.setContent(Content);
    }
}

