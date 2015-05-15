package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7110  Characteristic value  an..35
 * To identify the value of a characteristic.
 */
public class E7110 extends Element {

    public E7110() {
        this(null);
    }

    public E7110(String Content) {
        super("7110", "Characteristic value", "an..35", "To identify the value of a characteristic.", "");
        this.setContent(Content);
    }
}

