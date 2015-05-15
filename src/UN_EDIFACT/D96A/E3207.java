package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3207  Country, coded  an..3
 * Identification of the name of a country or other geographical entity as specified in ISO 3166.
 */
public class E3207 extends Element {

    public E3207() {
        this(null);
    }

    public E3207(String Content) {
        super("3207", "Country, coded", "an..3", "Identification of the name of a country or other geographical entity as specified in ISO 3166.", "Use ISO 3166 two alpha country code.");
        this.setContent(Content);
    }
}

