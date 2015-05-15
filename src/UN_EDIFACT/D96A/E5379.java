package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5379  Product group type, coded  an..3
 * Specification of the type of product group used for products.
 */
public class E5379 extends Element {

    public E5379() {
        this(null);
    }

    public E5379(String Content) {
        super("5379", "Product group type, coded", "an..3", "Specification of the type of product group used for products.", "");
        this.setContent(Content);
    }
}

