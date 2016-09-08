package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C239 extends CompositeElement {
    public E6246 e6246;
    public E6411 e6411;


    public C239() {
        this(false, null, null);
    }


    public C239(Boolean Mandatory, String s6246, String s6411) {
        super("C239", "TEMPERATURE SETTING", "The temperature under which the goods are (to be) stored or shipped.");
        this.setMandatory(Mandatory);
        e6246 = new E6246();
        e6411 = new E6411();
        e6246.setContent(s6246);
        e6411.setContent(s6411);
        addElement(e6246);
        addElement(e6411);
    }


}

