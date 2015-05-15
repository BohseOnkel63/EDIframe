package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7085  Nature of cargo, coded  an..3
 * Code indicating the type of cargo as a rough classification.
 */
public class E7085 extends Element {

    public E7085() {
        this(null);
    }

    public E7085(String Content) {
        super("7085", "Nature of cargo, coded", "an..3", "Code indicating the type of cargo as a rough classification.", "Association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

