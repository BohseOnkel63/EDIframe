package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2017  Despatch pattern timing, coded  an..3
 * Code specifying the detailed times for routine shipments or deliveries within data element 2015 Despatch pattern, coded.
 */
public class E2017 extends Element {

    public E2017() {
        this(null);
    }

    public E2017(String Content) {
        super("2017", "Despatch pattern timing, coded", "an..3", "Code specifying the detailed times for routine shipments or deliveries within data element 2015 Despatch pattern, coded.", "");
        this.setContent(Content);
    }
}

