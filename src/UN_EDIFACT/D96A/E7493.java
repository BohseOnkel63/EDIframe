package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7493  Damage details qualifier  an..3
 * Code giving specific meaning to the damage details.
 */
public class E7493 extends Element {

    public E7493() {
        this(null);
    }

    public E7493(String Content) {
        super("7493", "Damage details qualifier", "an..3", "Code giving specific meaning to the damage details.", "");
        this.setContent(Content);
    }
}

