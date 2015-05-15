package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4055  Terms of delivery or transport function, coded  an..3
 * Indication whether the terms relate to e.g. price conditions, delivery conditions, transport conditions, or a combination of these.
 */
public class E4055 extends Element {

    public E4055() {
        this(null);
    }

    public E4055(String Content) {
        super("4055", "Terms of delivery or transport function, coded", "an..3", "Indication whether the terms relate to e.g. price conditions, delivery conditions, transport conditions, or a combination of these.", "");
        this.setContent(Content);
    }
}

