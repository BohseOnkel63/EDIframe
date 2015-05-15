package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9303  Sealing party, coded  an..3
 * Identification of the issuer of the seal number.
 */
public class E9303 extends Element {

    public E9303() {
        this(null);
    }

    public E9303(String Content) {
        super("9303", "Sealing party, coded", "an..3", "Identification of the issuer of the seal number.", "");
        this.setContent(Content);
    }
}

