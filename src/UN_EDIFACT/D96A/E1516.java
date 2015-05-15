package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1516  File format  an..17
 * To give an identification of the file format.
 */
public class E1516 extends Element {

    public E1516() {
        this(null);
    }

    public E1516(String Content) {
        super("1516", "File format", "an..17", "To give an identification of the file format.", "");
        this.setContent(Content);
    }
}

