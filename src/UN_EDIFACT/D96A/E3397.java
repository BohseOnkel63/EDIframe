package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3397  Name status, coded  an..3
 * To specify the status of a name (such as current name).
 */
public class E3397 extends Element {

    public E3397() {
        this(null);
    }

    public E3397(String Content) {
        super("3397", "Name status, coded", "an..3", "To specify the status of a name (such as current name).", "");
        this.setContent(Content);
    }
}

