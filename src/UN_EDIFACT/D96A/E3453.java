package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3453  Language, coded  an..3
 * Code of language (ISO 639-1988).
 */
public class E3453 extends Element {

    public E3453() {
        this(null);
    }

    public E3453(String Content) {
        super("3453", "Language, coded", "an..3", "Code of language (ISO 639-1988).", "Use ISO 639-1988.");
        this.setContent(Content);
    }
}

