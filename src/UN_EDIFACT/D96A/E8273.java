package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8273  Dangerous goods regulations, coded  an..3
 * Code indicating the regulation, international or national, applicable for a means of transport.
 */
public class E8273 extends Element {

    public E8273() {
        this(null);
    }

    public E8273(String Content) {
        super("8273", "Dangerous goods regulations, coded", "an..3", "Code indicating the regulation, international or national, applicable for a means of transport.", "");
        this.setContent(Content);
    }
}

