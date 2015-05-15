package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7077  Item description type, coded  an..3
 * Code indicating the format of a description.
 */
public class E7077 extends Element {

    public E7077() {
        this(null);
    }

    public E7077(String Content) {
        super("7077", "Item description type, coded", "an..3", "Code indicating the format of a description.", "");
        this.setContent(Content);
    }
}

