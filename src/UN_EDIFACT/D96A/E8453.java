package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8453  Nationality of means of transport, coded  an..3
 * Coded name of the country in which a means of transport is registered.
 */
public class E8453 extends Element {

    public E8453() {
        this(null);
    }

    public E8453(String Content) {
        super("8453", "Nationality of means of transport, coded", "an..3", "Coded name of the country in which a means of transport is registered.", "Use ISO 3166 alpha two country code.");
        this.setContent(Content);
    }
}

