package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0029  Processing priority code  a1
 * Code determined by the sender requesting processing priority for the interchange.
 */
public class UN_E0029 extends Element {

    public UN_E0029() {
        this(null);
    }

    public UN_E0029(String Content) {
        super("0029", "Processing priority code", "a1", "Code determined by the sender requesting processing priority for the interchange.");
        this.setContent(Content);
    }
}

