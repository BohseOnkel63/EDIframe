package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7504  Type of unit/component  an..35
 * Description identifying the type of unit/component of an object (e.g. lock, door, tyre).
 */
public class E7504 extends Element {

    public E7504() {
        this(null);
    }

    public E7504(String Content) {
        super("7504", "Type of unit/component", "an..35", "Description identifying the type of unit/component of an object (e.g. lock, door, tyre).", "");
        this.setContent(Content);
    }
}

