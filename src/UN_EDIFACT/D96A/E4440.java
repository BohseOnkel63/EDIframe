package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4440  Free text  an..70
 * Free text field available to the message sender for information.
 */
public class E4440 extends Element {

    public E4440() {
        this(null);
    }

    public E4440(String Content) {
        super("4440", "Free text", "an..70", "Free text field available to the message sender for information.", "");
        this.setContent(Content);
    }
}

