package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3194  Account holder number  an..35
 * Account number of the holder of the account.
 */
public class E3194 extends Element {

    public E3194() {
        this(null);
    }

    public E3194(String Content) {
        super("3194", "Account holder number", "an..35", "Account number of the holder of the account.", "");
        this.setContent(Content);
    }
}

