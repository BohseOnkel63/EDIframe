package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1508  File name  an..35
 * Name assigned to a file.
 */
public class E1508 extends Element {

    public E1508() {
        this(null);
    }

    public E1508(String Content) {
        super("1508", "File name", "an..35", "Name assigned to a file.", "");
        this.setContent(Content);
    }
}

