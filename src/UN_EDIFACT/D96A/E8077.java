package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8077  Equipment supplier, coded  an..3
 * To indicate the party that is the supplier of the equipment.
 */
public class E8077 extends Element {

    public E8077() {
        this(null);
    }

    public E8077(String Content) {
        super("8077", "Equipment supplier, coded", "an..3", "To indicate the party that is the supplier of the equipment.", "");
        this.setContent(Content);
    }
}

