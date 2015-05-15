package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9015  Status type, coded  an..3
 * Code identifying the type of status event.
 */
public class E9015 extends Element {

    public E9015() {
        this(null);
    }

    public E9015(String Content) {
        super("9015", "Status type, coded", "an..3", "Code identifying the type of status event.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

