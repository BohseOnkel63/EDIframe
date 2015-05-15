package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3436  Institution branch place  an..70
 * Official name of the place where the institution branch is situated.
 */
public class E3436 extends Element {

    public E3436() {
        this(null);
    }

    public E3436(String Content) {
        super("3436", "Institution branch place", "an..70", "Official name of the place where the institution branch is situated.", "");
        this.setContent(Content);
    }
}

