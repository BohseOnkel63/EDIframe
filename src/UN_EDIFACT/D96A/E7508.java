package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7508  Damage severity  an..35
 * Description specifying the severity of damage to an object.
 */
public class E7508 extends Element {

    public E7508() {
        this(null);
    }

    public E7508(String Content) {
        super("7508", "Damage severity", "an..35", "Description specifying the severity of damage to an object.", "");
        this.setContent(Content);
    }
}

