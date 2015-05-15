package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7505  Type of unit/component, coded  an..3
 * Code identifying the type of unit/component of an object (e.g. lock, door, tyre).
 */
public class E7505 extends Element {

    public E7505() {
        this(null);
    }

    public E7505(String Content) {
        super("7505", "Type of unit/component, coded", "an..3", "Code identifying the type of unit/component of an object (e.g. lock, door, tyre).", "");
        this.setContent(Content);
    }
}

