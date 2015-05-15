package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1082  Line item number  n..6
 * Serial number designating each separate item within a series of articles.
 */
public class E1082 extends Element {

    public E1082() {
        this(null);
    }

    public E1082(String Content) {
        super("1082", "Line item number", "n..6", "Serial number designating each separate item within a series of articles.", "");
        this.setContent(Content);
    }
}

