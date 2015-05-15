package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0096  Segment position in message body  n..6
 * The numerical count position of a specific segment that is within the actual received message body. The numbering starts with, and includes, the UNH segment as segment number 1. To identify a segment that contains an error, this is the numerical count position of that segment. To report that a segment is missing, this is the numerical count position of the last segment that was processed before the position where the missing segment was expected to be. A missing segment group is denoted by identifying the first segment in the group as missing.
 */
public class UN_E0096 extends Element {

    public UN_E0096() {
        this(null);
    }

    public UN_E0096(String Content) {
        super("0096", "Segment position in message body", "n..6", "The numerical count position of a specific segment that is within the actual received message body. The numbering starts with, and includes, the UNH segment as segment number 1. To identify a segment that contains an error, this is the numerical count position of that segment. To report that a segment is missing, this is the numerical count position of the last segment that was processed before the position where the missing segment was expected to be. A missing segment group is denoted by identifying the first segment in the group as missing.");
        this.setContent(Content);
    }
}

