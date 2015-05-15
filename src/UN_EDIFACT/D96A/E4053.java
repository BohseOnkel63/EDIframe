package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4053  Terms of delivery or transport, coded  an..3
 * Identification of the terms agreed between two parties (e.g. seller/buyer, shipper/carrier) under which a product or service is provided.
 */
public class E4053 extends Element {

    public E4053() {
        this(null);
    }

    public E4053(String Content) {
        super("4053", "Terms of delivery or transport, coded", "an..3", "Identification of the terms agreed between two parties (e.g. seller/buyer, shipper/carrier) under which a product or service is provided.", "Use UN/ECE Recommendation No. 5 Incoterms 1990.  If not applicable, use appropriate code set in combination with 1131/3055.");
        this.setContent(Content);
    }
}

