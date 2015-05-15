package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3412  Department or employee  an..35
 * The department or person within an organizational entity.
 */
public class E3412 extends Element {

    public E3412() {
        this(null);
    }

    public E3412(String Content) {
        super("3412", "Department or employee", "an..35", "The department or person within an organizational entity.", "");
        this.setContent(Content);
    }
}

