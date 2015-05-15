package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8393  Returnable package load contents, coded  an..3
 * To indicate the composition of goods loaded into a returnable package.
 */
public class E8393 extends Element {

    public E8393() {
        this(null);
    }

    public E8393(String Content) {
        super("8393", "Returnable package load contents, coded", "an..3", "To indicate the composition of goods loaded into a returnable package.", "");
        this.setContent(Content);
    }
}

