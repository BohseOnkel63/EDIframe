package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4511  Requested information, coded  an..3
 * To specify the information requested in a responding message in a coded form.
 */
public class E4511 extends Element {

    public E4511() {
        this(null);
    }

    public E4511(String Content) {
        super("4511", "Requested information, coded", "an..3", "To specify the information requested in a responding message in a coded form.", "");
        this.setContent(Content);
    }
}

