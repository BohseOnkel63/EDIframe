package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9011  Status event, coded  an..3
 * Code identifying a status event.
 */
public class E9011 extends Element {

    public E9011() {
        this(null);
    }

    public E9011(String Content) {
        super("9011", "Status event, coded", "an..3", "Code identifying a status event.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

