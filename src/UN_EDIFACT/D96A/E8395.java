package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8395  Returnable package freight payment responsibility, coded  an..3
 * To indicate responsibility for payment of return freight charges for packaging that is returnable.
 */
public class E8395 extends Element {

    public E8395() {
        this(null);
    }

    public E8395(String Content) {
        super("8395", "Returnable package freight payment responsibility, coded", "an..3", "To indicate responsibility for payment of return freight charges for packaging that is returnable.", "");
        this.setContent(Content);
    }
}

