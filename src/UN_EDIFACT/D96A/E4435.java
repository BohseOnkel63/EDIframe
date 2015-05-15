package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4435  Payment channel, coded  an..3
 * Identification of the channel of payment.
 */
public class E4435 extends Element {

    public E4435() {
        this(null);
    }

    public E4435(String Content) {
        super("4435", "Payment channel, coded", "an..3", "Identification of the channel of payment.", "");
        this.setContent(Content);
    }
}

