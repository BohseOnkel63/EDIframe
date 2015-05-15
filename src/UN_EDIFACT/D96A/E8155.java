package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8155  Equipment size and type identification  an..10
 * Coded description of the size and type of equipment e.g. unit load device.
 */
public class E8155 extends Element {

    public E8155() {
        this(null);
    }

    public E8155(String Content) {
        super("8155", "Equipment size and type identification", "an..10", "Coded description of the size and type of equipment e.g. unit load device.", "User or association defined code.  May be used in combination with 1131/3055. See ISO 6346 for seagoing containers.");
        this.setContent(Content);
    }
}

