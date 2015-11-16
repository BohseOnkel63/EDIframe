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
public class CompositeElement {
    private String Tag;
    private String Description;
    private String LongDescription;
    private Boolean Mandatory;
    private ArrayList<Element> ElementList;

    public CompositeElement(String Tag, String Description, String LongDescription) {
        this.Tag = Tag;
        this.Description = Description;
        this.LongDescription = LongDescription;
        this.ElementList = new ArrayList<>();
    }

    public void addElement(Element E) {
        ElementList.add(E);
    }
    
    @Override
    public String toString() {
        String output;
        output = "";
        //ArrayList<Element> eList = getElementList();
        
        System.out.println("ElementList.size()=" + ElementList.size());
        for (Element e : ElementList ) {
            System.out.println(e.getClass().getCanonicalName() + " " + e.getDescription() + "  " + e.getFormatString());
            System.out.println("Objektin indeksi: " + ElementList.indexOf(e));
            if (ElementList.indexOf(e) == 0) {
                output = e.toString() + ":";
            } else {
                output = output + e.toString() + ":";
            }
        }
        //output = e1001.toString() + ":" + e1131.toString() + ":" + e3055.toString() + ":" + e1000.toString();
        return EdiFunctions.trim(output);
    }

    public void validate() throws ValidityException {
        try {
            for (Element e : ElementList ) {
                e.validate();
            }
        } catch(ValidityException ex) {
            throw new ValidityException(this.getTag() + "." + ex.getMessage());
        }
    }

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

    public void setElementList(ArrayList elementList) {
        this.ElementList = elementList;
    }

}
