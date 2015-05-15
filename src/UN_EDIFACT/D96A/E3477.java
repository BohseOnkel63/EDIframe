package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3477  Address format, coded  an..3
 * To specify the content of the various address components.
 */
public class E3477 extends Element {

    public E3477() {
        this(null);
    }

    public E3477(String Content) {
        super("3477", "Address format, coded", "an..3", "To specify the content of the various address components.", "");
        this.setContent(Content);
    }
}

