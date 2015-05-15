package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4441  Free text, coded  an..3
 * Free text in coded form.
 */
public class E4441 extends Element {

    public E4441() {
        this(null);
    }

    public E4441(String Content) {
        super("4441", "Free text, coded", "an..3", "Free text in coded form.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

