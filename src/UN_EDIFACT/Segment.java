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
    private String tag;
    private String description;
    private String longDescription;

    private Boolean mandatory;
    private ArrayList elementList;
    //public Object[] elementArray;

    public Segment(String Tag, String Description, String LongDescription) {
        this.tag = Tag;
        this.description = Description;
        this.longDescription = LongDescription;
        this.elementList = new ArrayList();
    }

    public final void addElement(Element e) {
        boolean add = this.elementList.add(e);
    }
    
    public final void addElement(CompositeElement e) {
        boolean add = this.elementList.add(e);
    }
    /*
    public final void addElement(Object o) {
        //elementList.add((Object) O);
        Element e;
        CompositeElement ce;
        
        e = null;
        ce = null;
        
        try {
            if (o.getClass().isInstance(e)) {
                 //e = (Element) o;
                 this.elementList.add((Element) o);
             }
            else if (o.getClass().isInstance(ce)) {
                 ce = (CompositeElement) o;
                 this.elementList.add(ce);
             }
        } catch(ValidityException ex) {
            throw new ValidityException(this.getTag() + "." + ex.getMessage());
        }
    }
    */

    @Override
    public String toString() {
        String output;
        output = "";
        Element e;
        CompositeElement ce;
        
        e = null;
        ce = null;
        
        //System.out.println("Segmentti " + this.tag);
        //System.out.println("ElementList.size()=" + elementList.size());
        output = this.tag;
        
        for (Object o : elementList ) {
            //System.out.println("Objektin yksinkert. nimi: " + o.getClass().getSimpleName());
            //System.out.println("Objektin nimi:            " + o.getClass());
            //System.out.println("Objektin indeksi:         " + elementList.indexOf(o));
            if (elementList.indexOf(o) == 0) {
                output = output + "+" + o.toString();
            } else {
                output = output + "+" + o.toString();
            }
            /*if (o.getClass().isInstance(e)) {
                System.out.println("Objekti on " + o.getClass().getCanonicalName());
                e = (Element) o;
                if (elementList.indexOf(o) == 0) {
                    output = e.toString() + "+";
                } else {
                    output = output + e.toString() + "+";
                }
            } 
            if (o.getClass().isInstance(ce)) {
                ce = (CompositeElement) o;
                if (elementList.indexOf(o) == 0) {
                    output = ce.toString() + "+";
                } else {
                    output = output + ce.toString() + "+";
                }
            }*/
        }
        //return output + "'";
        return EdiFunctions.trim(output) + "'";
    }
    
    
    public void validate() throws ValidityException {
        Element e;
        CompositeElement ce;
        
        e = null;
        ce = null;
        
        for (Object o : elementList ) {
           try {
               try {
                    e = (Element) o;
                    e.validate();
               } catch(ClassCastException ex) {
                   ce = (CompositeElement) o;
                   ce.validate();
               }
                /*if (o.getClass().isInstance(e)) {
                    e = (Element) o;
                    e.validate();
                }
                if (o.getClass().isInstance(ce)) {
                    ce = (CompositeElement) o;
                    ce.validate();
                }*/
            } catch(ValidityException ex) {
                throw new ValidityException(this.getTag() + "." + ex.getMessage());
            }
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
        return tag;
    }

    public void setTag(String Tag) {
        this.tag = Tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String LongDescription) {
        this.longDescription = LongDescription;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public final void setMandatory(Boolean Mandatory) {
        this.mandatory = Mandatory;
    }

    public ArrayList getElementList() {
        return elementList;
    }

    public void setElementList(ArrayList ElementList) {
        this.elementList = ElementList;
    }

}
