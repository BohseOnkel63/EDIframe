package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0017  Date  n8
 * Local date when an interchange or a group was prepared.
 */
public class UN_E0017 extends Element {

    public UN_E0017() {
        this(null);
    }

    public UN_E0017(String Content) {
        super("0017", "Date", "n8", "Local date when an interchange or a group was prepared.");
        this.setContent(Content);
    }
}

