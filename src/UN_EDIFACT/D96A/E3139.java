package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3139  Contact function, coded  an..3
 * Code specifying the function of a contact (e.g. department or person).
 */
public class E3139 extends Element {

    public E3139() {
        this(null);
    }

    public E3139(String Content) {
        super("3139", "Contact function, coded", "an..3", "Code specifying the function of a contact (e.g. department or person).", "");
        this.setContent(Content);
    }
}

