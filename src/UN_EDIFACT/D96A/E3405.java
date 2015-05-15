package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3405  Name component qualifier  an..3
 * To indicate a part of the name such as family name or given name.
 */
public class E3405 extends Element {

    public E3405() {
        this(null);
    }

    public E3405(String Content) {
        super("3405", "Name component qualifier", "an..3", "To indicate a part of the name such as family name or given name.", "");
        this.setContent(Content);
    }
}

