package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3124  Name and address line  an..35
 * Free form name and address description.
 */
public class E3124 extends Element {

    public E3124() {
        this(null);
    }

    public E3124(String Content) {
        super("3124", "Name and address line", "an..35", "Free form name and address description.", "");
        this.setContent(Content);
    }
}

