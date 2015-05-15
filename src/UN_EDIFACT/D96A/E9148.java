package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9148  Directory status  an..3
 * The status of a directory set.
 */
public class E9148 extends Element {

    public E9148() {
        this(null);
    }

    public E9148(String Content) {
        super("9148", "Directory status", "an..3", "The status of a directory set.", "");
        this.setContent(Content);
    }
}

