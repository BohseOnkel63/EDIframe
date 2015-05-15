package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0068  Common access reference  an..35
 * Reference serving as a key to relate all subsequent transfers of data to the same business case or file.
 */
public class UN_E0068 extends Element {

    public UN_E0068() {
        this(null);
    }

    public UN_E0068(String Content) {
        super("0068", "Common access reference", "an..35", "Reference serving as a key to relate all subsequent transfers of data to the same business case or file.");
        this.setContent(Content);
    }
}

