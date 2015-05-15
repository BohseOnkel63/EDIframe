package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7500  Type of damage  an..35
 * Description specifying the type of damage to an object.
 */
public class E7500 extends Element {

    public E7500() {
        this(null);
    }

    public E7500(String Content) {
        super("7500", "Type of damage", "an..35", "Description specifying the type of damage to an object.", "");
        this.setContent(Content);
    }
}

