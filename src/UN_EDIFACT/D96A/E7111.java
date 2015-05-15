package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7111  Characteristic value, coded  an..3
 * To identify the value of a particular characteristic in coded form.
 */
public class E7111 extends Element {

    public E7111() {
        this(null);
    }

    public E7111(String Content) {
        super("7111", "Characteristic value, coded", "an..3", "To identify the value of a particular characteristic in coded form.", "User or association defined code may be used in association with 1131/3055.");
        this.setContent(Content);
    }
}

