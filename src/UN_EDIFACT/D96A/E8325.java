package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8325  Category of means of transport, coded  an..3
 * Identification of the type of means of transport determined to carry particular goods, not necessarily being hazardous.
 */
public class E8325 extends Element {

    public E8325() {
        this(null);
    }

    public E8325(String Content) {
        super("8325", "Category of means of transport, coded", "an..3", "Identification of the type of means of transport determined to carry particular goods, not necessarily being hazardous.", "");
        this.setContent(Content);
    }
}

