package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7419  Hazardous material class code, identification  an..4
 * Code specifying the kind of hazard for a material.
 */
public class E7419 extends Element {

    public E7419() {
        this(null);
    }

    public E7419(String Content) {
        super("7419", "Hazardous material class code, identification", "an..4", "Code specifying the kind of hazard for a material.", "Association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

