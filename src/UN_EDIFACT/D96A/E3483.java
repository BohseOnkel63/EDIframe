package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3483  Religion, coded  an..3
 * To specify the religion of a person in a coded form.
 */
public class E3483 extends Element {

    public E3483() {
        this(null);
    }

    public E3483(String Content) {
        super("3483", "Religion, coded", "an..3", "To specify the religion of a person in a coded form.", "");
        this.setContent(Content);
    }
}

