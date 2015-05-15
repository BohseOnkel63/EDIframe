package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6343  Currency qualifier  an..3
 * Code giving specific meaning to data element 6345 Currency.
 */
public class E6343 extends Element {

    public E6343() {
        this(null);
    }

    public E6343(String Content) {
        super("6343", "Currency qualifier", "an..3", "Code giving specific meaning to data element 6345 Currency.", "");
        this.setContent(Content);
    }
}

