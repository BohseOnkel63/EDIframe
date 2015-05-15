package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4347  Product id. function qualifier  an..3
 * Indication of the function of the product code.
 */
public class E4347 extends Element {

    public E4347() {
        this(null);
    }

    public E4347(String Content) {
        super("4347", "Product id. function qualifier", "an..3", "Indication of the function of the product code.", "");
        this.setContent(Content);
    }
}

