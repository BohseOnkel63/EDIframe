package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4052  Terms of delivery or transport  an..70
 * Terms agreed between two parties (e.g. seller/buyer, shipper/carrier) under which a product or service is provided.
 */
public class E4052 extends Element {

    public E4052() {
        this(null);
    }

    public E4052(String Content) {
        super("4052", "Terms of delivery or transport", "an..70", "Terms agreed between two parties (e.g. seller/buyer, shipper/carrier) under which a product or service is provided.", "");
        this.setContent(Content);
    }
}

