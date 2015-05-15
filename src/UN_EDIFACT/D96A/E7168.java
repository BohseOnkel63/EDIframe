package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7168  Level number  n1
 * Relative hierarchical position of a data segment within a message as expressed in a branching diagram.
 */
public class E7168 extends Element {

    public E7168() {
        this(null);
    }

    public E7168(String Content) {
        super("7168", "Level number", "n1", "Relative hierarchical position of a data segment within a message as expressed in a branching diagram.", "");
        this.setContent(Content);
    }
}

