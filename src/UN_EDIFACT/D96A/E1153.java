package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A, 1153 Reference qualifier an..3 Code giving specific meaning to a reference segment or a reference number.
 * 
 */
public class E1153 extends Element {

    public E1153() {
        this(null);
    }

    /**
     * 
     * @param Content Set content of the element
     */
    public E1153(String Content) {
        super("1153", "Reference qualifier", "an..3", "Code giving specific meaning to a reference segment or a reference number.", "");
        this.setContent(Content);
    }
}

