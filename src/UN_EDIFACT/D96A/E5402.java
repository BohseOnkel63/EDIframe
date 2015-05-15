package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5402  Rate of exchange  n..12
 * The rate at which one specified currency is expressed in another specified currency.
 */
public class E5402 extends Element {

    public E5402() {
        this(null);
    }

    public E5402(String Content) {
        super("5402", "Rate of exchange", "n..12", "The rate at which one specified currency is expressed in another specified currency.", "");
        this.setContent(Content);
    }
}

