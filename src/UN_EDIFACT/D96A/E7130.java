package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7130  Customer authorization number  an..17
 * Customer provided authorization number to allow supplier to ship goods under specific freight conditions.  This number will be transmitted back to customer in the dispatch advice message.
 */
public class E7130 extends Element {

    public E7130() {
        this(null);
    }

    public E7130(String Content) {
        super("7130", "Customer authorization number", "an..17", "Customer provided authorization number to allow supplier to ship goods under specific freight conditions.  This number will be transmitted back to customer in the dispatch advice message.", "");
        this.setContent(Content);
    }
}

