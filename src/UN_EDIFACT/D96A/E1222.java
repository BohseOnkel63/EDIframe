package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1222  Configuration level  n..2
 * Number indicating the level of an object which is in a hierarchy.
 */
public class E1222 extends Element {

    public E1222() {
        this(null);
    }

    public E1222(String Content) {
        super("1222", "Configuration level", "n..2", "Number indicating the level of an object which is in a hierarchy.", "");
        this.setContent(Content);
    }
}

