package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1507  Class designator, coded  an..3
 * To identify a designated class.
 */
public class E1507 extends Element {

    public E1507() {
        this(null);
    }

    public E1507(String Content) {
        super("1507", "Class designator, coded", "an..3", "To identify a designated class.", "");
        this.setContent(Content);
    }
}

