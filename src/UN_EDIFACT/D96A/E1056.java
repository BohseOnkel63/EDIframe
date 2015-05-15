package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1056  Version  an..9
 * To specify the version number or name of an object.
 */
public class E1056 extends Element {

    public E1056() {
        this(null);
    }

    public E1056(String Content) {
        super("1056", "Version", "an..9", "To specify the version number or name of an object.", "");
        this.setContent(Content);
    }
}

