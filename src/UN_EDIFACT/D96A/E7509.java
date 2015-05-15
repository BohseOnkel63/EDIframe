package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7509  Damage severity, coded  an..3
 * Code specifying the severity of damage to an object.
 */
public class E7509 extends Element {

    public E7509() {
        this(null);
    }

    public E7509(String Content) {
        super("7509", "Damage severity, coded", "an..3", "Code specifying the severity of damage to an object.", "");
        this.setContent(Content);
    }
}

