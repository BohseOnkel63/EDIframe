package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8255  Packing instruction, coded  an..3
 * Code defining the quantity and the type of package in which a product is allowed to be shipped in a passenger or freight aircraft.
 */
public class E8255 extends Element {

    public E8255() {
        this(null);
    }

    public E8255(String Content) {
        super("8255", "Packing instruction, coded", "an..3", "Code defining the quantity and the type of package in which a product is allowed to be shipped in a passenger or freight aircraft.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

