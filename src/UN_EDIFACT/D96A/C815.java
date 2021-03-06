package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C815 extends CompositeElement {
    public E4039 e4039;
    public E1131 e1131;
    public E3055 e3055;
    public E4038 e4038;


    public C815() {
        this(false, null, null, null, null);
    }


    public C815(Boolean Mandatory, String s4039, String s1131, String s3055, String s4038) {
        super("C815", "ADDITIONAL SAFETY INFORMATION", "To identify additional safety information.");
        this.setMandatory(Mandatory);
        e4039 = new E4039();
        e1131 = new E1131();
        e3055 = new E3055();
        e4038 = new E4038();
        e4039.setContent(s4039);
        e4039.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e4038.setContent(s4038);
        addElement(e4039);
        addElement(e1131);
        addElement(e3055);
        addElement(e4038);
    }


}

