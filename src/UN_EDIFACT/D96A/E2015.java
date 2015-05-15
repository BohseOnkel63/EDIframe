package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2015  Despatch pattern, coded  an..3
 * Code specifying the days/periods for routine shipments or deliveries.
 */
public class E2015 extends Element {

    public E2015() {
        this(null);
    }

    public E2015(String Content) {
        super("2015", "Despatch pattern, coded", "an..3", "Code specifying the days/periods for routine shipments or deliveries.", "");
        this.setContent(Content);
    }
}

