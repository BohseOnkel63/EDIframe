package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8211  Permission for transport, coded  an..3
 * Code giving evidence that transportation of particular hazardous cargo is permitted and identifies the restrictions being put upon a particular transport.
 */
public class E8211 extends Element {

    public E8211() {
        this(null);
    }

    public E8211(String Content) {
        super("8211", "Permission for transport, coded", "an..3", "Code giving evidence that transportation of particular hazardous cargo is permitted and identifies the restrictions being put upon a particular transport.", "Code values to be provided.");
        this.setContent(Content);
    }
}

