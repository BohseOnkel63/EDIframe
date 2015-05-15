package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9302  Sealing party  an..35
 * Clear text, representing the name of the issuer of the seal number.
 */
public class E9302 extends Element {

    public E9302() {
        this(null);
    }

    public E9302(String Content) {
        super("9302", "Sealing party", "an..35", "Clear text, representing the name of the issuer of the seal number.", "");
        this.setContent(Content);
    }
}

