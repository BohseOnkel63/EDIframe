package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8154  Equipment size and type  an..35
 * Plain language description of the size and type of equipment e.g. unit load device.
 */
public class E8154 extends Element {

    public E8154() {
        this(null);
    }

    public E8154(String Content) {
        super("8154", "Equipment size and type", "an..35", "Plain language description of the size and type of equipment e.g. unit load device.", "");
        this.setContent(Content);
    }
}

