package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4439  Payment conditions, coded  an..3
 * Identification of the method employed or to be employed in order that a payment may be made or regarded as made. The method may or may not be tied to a guarantee.
 */
public class E4439 extends Element {

    public E4439() {
        this(null);
    }

    public E4439(String Content) {
        super("4439", "Payment conditions, coded", "an..3", "Identification of the method employed or to be employed in order that a payment may be made or regarded as made. The method may or may not be tied to a guarantee.", "");
        this.setContent(Content);
    }
}

