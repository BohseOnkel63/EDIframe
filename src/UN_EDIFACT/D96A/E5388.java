package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5388  Product group  an..35
 * Free form description allocated by the seller to identify uniquely his product group for a product or a series of products.
 */
public class E5388 extends Element {

    public E5388() {
        this(null);
    }

    public E5388(String Content) {
        super("5388", "Product group", "an..35", "Free form description allocated by the seller to identify uniquely his product group for a product or a series of products.", "");
        this.setContent(Content);
    }
}

