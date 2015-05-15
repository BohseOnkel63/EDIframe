package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1049  Message section, coded  an..3
 * Recognition of a particular part of a message.
 */
public class E1049 extends Element {

    public E1049() {
        this(null);
    }

    public E1049(String Content) {
        super("1049", "Message section, coded", "an..3", "Recognition of a particular part of a message.", "");
        this.setContent(Content);
    }
}

