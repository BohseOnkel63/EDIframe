package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8323  Transport movement, coded  an..3
 * Code indicating the movement of goods (e.g. import, export, transit).
 */
public class E8323 extends Element {

    public E8323() {
        this(null);
    }

    public E8323(String Content) {
        super("8323", "Transport movement, coded", "an..3", "Code indicating the movement of goods (e.g. import, export, transit).", "");
        this.setContent(Content);
    }
}

