package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C220 extends CompositeElement {
    public E8067 e8067;
    public E8066 e8066;


    public C220() {
        this(false, null, null);
    }


    public C220(Boolean Mandatory, String s8067, String s8066) {
        super("C220", "MODE OF TRANSPORT", "Method of transport code or name. Code preferred.");
        this.setMandatory(Mandatory);
        e8067 = new E8067();
        e8066 = new E8066();
        e8067.setContent(s8067);
        e8066.setContent(s8066);
        addElement(e8067);
        addElement(e8066);
    }


}

