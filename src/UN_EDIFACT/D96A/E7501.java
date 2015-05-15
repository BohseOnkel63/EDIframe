package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7501  Type of damage, coded  an..3
 * Code specifying the type of damage to an object.
 */
public class E7501 extends Element {

    public E7501() {
        this(null);
    }

    public E7501(String Content) {
        super("7501", "Type of damage, coded", "an..3", "Code specifying the type of damage to an object.", "");
        this.setContent(Content);
    }
}

