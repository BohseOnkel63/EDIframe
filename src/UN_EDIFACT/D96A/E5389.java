package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5389  Product group, coded  an..3
 * Code allocated by the seller to identify uniquely his product group for a product or series of products.
 */
public class E5389 extends Element {

    public E5389() {
        this(null);
    }

    public E5389(String Content) {
        super("5389", "Product group, coded", "an..3", "Code allocated by the seller to identify uniquely his product group for a product or series of products.", "No code values at present.");
        this.setContent(Content);
    }
}

