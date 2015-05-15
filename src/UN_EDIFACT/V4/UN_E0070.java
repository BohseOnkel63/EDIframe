package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0070  Sequence of transfers  n..2
 * Number assigned by the sender indicating the transfer sequence of a message related to the same topic. The message could be an addition or a change to an earlier transfer related to the same topic.
 */
public class UN_E0070 extends Element {

    public UN_E0070() {
        this(null);
    }

    public UN_E0070(String Content) {
        super("0070", "Sequence of transfers", "n..2", "Number assigned by the sender indicating the transfer sequence of a message related to the same topic. The message could be an addition or a change to an earlier transfer related to the same topic.");
        this.setContent(Content);
    }
}

