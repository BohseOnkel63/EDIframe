package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7502  Damage area  an..35
 * Description specifying where the damage is on an object.
 */
public class E7502 extends Element {

    public E7502() {
        this(null);
    }

    public E7502(String Content) {
        super("7502", "Damage area", "an..35", "Description specifying where the damage is on an object.", "");
        this.setContent(Content);
    }
}

