/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT;

import java.util.ArrayList;


/**
 *
 * @author mannelini
 */
public class Segment {
    private String Tag;
    private String Description;
    private String LongDescription;

    private Boolean Mandatory;
    private ArrayList ElementList;

    public Segment(String Tag, String Description, String LongDescription) {
        this.Tag = Tag;
        this.Description = Description;
        this.LongDescription = LongDescription;
        this.ElementList = new ArrayList<>();
    }

    public void addElement(Object O) {
        ElementList.add(O);
    }

    @Override
    public String toString() {
        String output;
        output = "";
        Element e;
        CompositeElement ce;
        
        e = null;
        ce = null;
        
        System.out.println("ElementList.size()=" + ElementList.size());
        for (Object o : ElementList ) {
            if (o.getClass().isInstance(e)) {
                e = (Element) o;
                if (ElementList.indexOf(o) == 0) {
                    output = e.toString() + "+";
                } else {
                    output = output + e.toString() + "+";
                }
            } 
            if (o.getClass().isInstance(ce)) {
                ce = (CompositeElement) o;
                if (ElementList.indexOf(o) == 0) {
                    output = ce.toString() + "+";
                } else {
                    output = output + ce.toString() + "+";
                }
            }
        }
        return EdiFunctions.trim(output);
    }
    
    
    public void validate() throws ValidityException {
        Element e;
        CompositeElement ce;
        
        e = null;
        ce = null;
        
        try {
            for (Object o : ElementList ) {
                if (o.getClass().isInstance(e)) {
                    e = (Element) o;
                    e.validate();
                }
                if (o.getClass().isInstance(ce)) {
                    ce = (CompositeElement) o;
                    ce.validate();
                }
            }
        } catch(ValidityException ex) {
            throw new ValidityException(this.getTag() + "." + ex.getMessage());
        }
    }
    
    /*************************************************************************/
    /* Getters and Setters                                                   */
    /*************************************************************************/

    /**
     * 
     * @return  
     */
    public String getTag() {
        return Tag;
    }

    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getLongDescription() {
        return LongDescription;
    }

    public void setLongDescription(String LongDescription) {
        this.LongDescription = LongDescription;
    }

    public Boolean getMandatory() {
        return Mandatory;
    }

    public final void setMandatory(Boolean Mandatory) {
        this.Mandatory = Mandatory;
    }

    public ArrayList getElementList() {
        return ElementList;
    }

    public void setElementList(ArrayList ElementList) {
        this.ElementList = ElementList;
    }

}
