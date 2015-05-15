package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9010  Status event  an..35
 * Description of a status event.
 */
public class E9010 extends Element {

    public E9010() {
        this(null);
    }

    public E9010(String Content) {
        super("9010", "Status event", "an..35", "Description of a status event.", "");
        this.setContent(Content);
    }
}

