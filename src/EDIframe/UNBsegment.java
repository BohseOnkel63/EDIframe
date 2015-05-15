/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDIframe;

/**
 *  UNB:n kuvaus: http://www.gefeg.com/jswg/v4/se/sed.htm
 * @author mannelini
 */
public class UNBsegment {
    
    private String UNBstring;
    private String eS001_0001;
    private String eS001_0002;
    private String eS001_0080;
    private String eS001_0133;
    private String eS002_0004;
    private String eS002_0007;
    private String eS002_0008;
    private String eS002_0042;
    private String eS003_0010;
    private String eS003_0007;
    private String eS003_0014;
    private String eS003_0046;
    private String eS004_0017;
    private String eS004_0019;
    private String e0020;
    private String eS005_0022;
    private String eS005_0025;
    private String e0026;
    private String e0029;
    private String e0031;
    private String e0032;
    private String e0035;
    
    String[][] UNBelements = 
          {
            {"S001", "SYNTAX IDENTIFIER", "M", "1"},
            {"0001", "Syntax identifier", "M", "a4"},
            {"0002", "Syntax version number", "M", "an1"},
            {"0080", "Service code list directory version number", "C", "an..6"},
            {"0133", "Character encoding, coded", "C", "an..3"},
            {"S002", "INTERCHANGE SENDER", "M", "1"},
            {"0004", "Interchange sender identification", "M", "an..35"},
            {"0007", "Identification code qualifier", "C", "an..4"},
            {"0008", "Interchange sender internal identification", "C", "an..35"},
            {"0042", "Interchange sender internal sub-identification", "C", "an..35"},
            {"S003", "INTERCHANGE RECIPIENT", "M", "1"},
            {"0010", "Interchange recipient identification", "M", "an..35"},
            {"0007", "Identification code qualifier", "C", "an..4"},
            {"0014", "Interchange recipient internal identification", "C", "an..35"},
            {"0046", "Interchange recipient internal sub-identification", "C", "an..35"},
            {"S004", "DATE AND TIME OF PREPARATION", "M", "1"},
            {"0017", "Date", "M", "n8"},
            {"0019", "Time", "M", "n4"},
            {"0020", "Interchange control reference", "M", "1", "an..14"},
            {"S005", "RECIPIENT'S REFERENCE/PASSWORD DETAILS", "C", "1"},
            {"0022", "Recipient reference/password", "M", "an..14"},
            {"0025", "Recipient reference/password qualifier", "C", "an2"},
            {"0026", "Application reference", "C", "1", "an..14"},
            {"0029", "Processing priority code", "C", "1", "a1"},
            {"0031", "Acknowledgement request", "C", "1", "n1"},
            {"0032", "Interchange agreement identifier", "C", "1", "an..35"},
            {"0035", "Test indicator", "C", "1", "n1"}
        };

    /**
     *
     * @param UNBstring
     */
    public UNBsegment(String UNBstring) {
        this.setUNBstring(UNBstring);
    }

    /**
     *
     * @return
     */
    public String geteS001_0001() {
        return eS001_0001;
    }

    /**
     *
     * @param eS001_0001
     */
    public void seteS001_0001(String eS001_0001) {
        this.eS001_0001 = eS001_0001;
    }

    /**
     *
     * @return
     */
    public String geteS001_0002() {
        return eS001_0002;
    }

    /**
     *
     * @param eS001_0002
     */
    public void seteS001_0002(String eS001_0002) {
        this.eS001_0002 = eS001_0002;
    }

    /**
     *
     * @return
     */
    public String geteS001_0080() {
        return eS001_0080;
    }

    /**
     *
     * @param eS001_0080
     */
    public void seteS001_0080(String eS001_0080) {
        this.eS001_0080 = eS001_0080;
    }

    /**
     *
     * @return
     */
    public String geteS001_0133() {
        return eS001_0133;
    }

    /**
     *
     * @param eS001_0133
     */
    public void seteS001_0133(String eS001_0133) {
        this.eS001_0133 = eS001_0133;
    }

    /**
     *
     * @return
     */
    public String geteS002_0004() {
        return eS002_0004;
    }

    /**
     *
     * @param eS002_0004
     */
    public void seteS002_0004(String eS002_0004) {
        this.eS002_0004 = eS002_0004;
    }

    /**
     *
     * @return
     */
    public String geteS002_0007() {
        return eS002_0007;
    }

    /**
     *
     * @param eS002_0007
     */
    public void seteS002_0007(String eS002_0007) {
        this.eS002_0007 = eS002_0007;
    }

    /**
     *
     * @return
     */
    public String geteS002_0008() {
        return eS002_0008;
    }

    /**
     *
     * @param eS002_0008
     */
    public void seteS002_0008(String eS002_0008) {
        this.eS002_0008 = eS002_0008;
    }

    /**
     *
     * @return
     */
    public String geteS002_0042() {
        return eS002_0042;
    }

    /**
     *
     * @param eS002_0042
     */
    public void seteS002_0042(String eS002_0042) {
        this.eS002_0042 = eS002_0042;
    }

    /**
     *
     * @return
     */
    public String geteS003_0010() {
        return eS003_0010;
    }

    /**
     *
     * @param eS003_0010
     */
    public void seteS003_0010(String eS003_0010) {
        this.eS003_0010 = eS003_0010;
    }

    /**
     *
     * @return
     */
    public String geteS003_0007() {
        return eS003_0007;
    }

    /**
     *
     * @param eS003_0007
     */
    public void seteS003_0007(String eS003_0007) {
        this.eS003_0007 = eS003_0007;
    }

    /**
     *
     * @return
     */
    public String geteS003_0014() {
        return eS003_0014;
    }

    /**
     *
     * @param eS003_0014
     */
    public void seteS003_0014(String eS003_0014) {
        this.eS003_0014 = eS003_0014;
    }

    /**
     *
     * @return
     */
    public String geteS003_0046() {
        return eS003_0046;
    }

    /**
     *
     * @param eS003_0046
     */
    public void seteS003_0046(String eS003_0046) {
        this.eS003_0046 = eS003_0046;
    }

    /**
     *
     * @return
     */
    public String geteS004_0017() {
        return eS004_0017;
    }

    /**
     *
     * @param eS004_0017
     */
    public void seteS004_0017(String eS004_0017) {
        this.eS004_0017 = eS004_0017;
    }

    /**
     *
     * @return
     */
    public String geteS004_0019() {
        return eS004_0019;
    }

    /**
     *
     * @param eS004_0019
     */
    public void seteS004_0019(String eS004_0019) {
        this.eS004_0019 = eS004_0019;
    }

    /**
     *
     * @return
     */
    public String getE0020() {
        return e0020;
    }

    /**
     *
     * @param e0020
     */
    public void setE0020(String e0020) {
        this.e0020 = e0020;
    }

    /**
     *
     * @return
     */
    public String geteS005_0022() {
        return eS005_0022;
    }

    /**
     *
     * @param eS005_0022
     */
    public void seteS005_0022(String eS005_0022) {
        this.eS005_0022 = eS005_0022;
    }

    /**
     *
     * @return
     */
    public String geteS005_0025() {
        return eS005_0025;
    }

    /**
     *
     * @param eS005_0025
     */
    public void seteS005_0025(String eS005_0025) {
        this.eS005_0025 = eS005_0025;
    }

    /**
     *
     * @return
     */
    public String getE0026() {
        return e0026;
    }

    /**
     *
     * @param e0026
     */
    public void setE0026(String e0026) {
        this.e0026 = e0026;
    }

    /**
     *
     * @return
     */
    public String getE0029() {
        return e0029;
    }

    /**
     *
     * @param e0029
     */
    public void setE0029(String e0029) {
        this.e0029 = e0029;
    }

    /**
     *
     * @return
     */
    public String getE0031() {
        return e0031;
    }

    /**
     *
     * @param e0031
     */
    public void setE0031(String e0031) {
        this.e0031 = e0031;
    }

    /**
     *
     * @return
     */
    public String getE0032() {
        return e0032;
    }

    /**
     *
     * @param e0032
     */
    public void setE0032(String e0032) {
        this.e0032 = e0032;
    }

    /**
     *
     * @return
     */
    public String getE0035() {
        return e0035;
    }

    /**
     *
     * @param e0035
     */
    public void setE0035(String e0035) {
        this.e0035 = e0035;
    }

    /**
     *
     * @return
     */
    public String getUNBstring() {
        return UNBstring;
    }

    private void setUNBstring(String UNBstring) {
        this.UNBstring = UNBstring;
    }
    
    /**
     *
     * @param Element
     * @return
     */
    public String getElementName(int Element) {
        int Index = getElementIndex(Element);
        return UNBelements[Index][0];
    }
    
    /**
     *
     * @param Element
     * @param CompElement
     * @return
     */
    public String getElementName(int Element, int CompElement) {
        int Index = getElementIndex(Element) + CompElement + 1;
        return UNBelements[Index][0];
    }
    
    /**
     *
     * @param Element
     * @return
     */
    public String getElementExplanation(int Element) {
        int Index = getElementIndex(Element);
        return UNBelements[Index][1];
    }
    
    /**
     *
     * @param Element
     * @param CompElement
     * @return
     */
    public String getElementExplanation(int Element, int CompElement) {
        int Index = getElementIndex(Element) + CompElement + 1;
        return UNBelements[Index][1];
    }
    
    /**
     *
     * @param Element
     * @return
     */
    public String getElementMandatory(int Element) {
        int Index = getElementIndex(Element);
        return UNBelements[Index][2];
    }
    
    /**
     *
     * @param Element
     * @param CompElement
     * @return
     */
    public String getElementMandatory(int Element, int CompElement) {
        int Index = getElementIndex(Element) + CompElement + 1;
        return UNBelements[Index][2];
    }
    
    /**
     *
     * @param Element
     * @return
     */
    public String getElementFormat(int Element) {
        int Index = getElementIndex(Element);
        return UNBelements[Index][3];
    }
    
    /**
     *
     * @param Element
     * @param CompElement
     * @return
     */
    public String getElementFormat(int Element, int CompElement) {
        int Index = getElementIndex(Element) + CompElement + 1;
        return UNBelements[Index][3];
    }
    
    private int getElementIndex(int ElementNo) {
        int Index = -1;
        switch(ElementNo) {
            case 1 : Index = 0;
                break;
            case 2 : Index = 5;
                break;
            case 3 : Index = 10;
                break;
            case 4 : Index = 15;
                break;
            case 5 : Index = 18;
                break;
            case 6 : Index = 19;
                break;
            case 7 : Index = 22;
                break;
            case 8 : Index = 23;
                break;
            case 9 : Index = 24;
                break;
            case 10 : Index = 25;
                break;
            case 11 : Index = 26;
                break;
        }
        return Index;
    }

    /**
     *
     * @param ElementNo
     * @return
     */
    public int getElementType(int ElementNo) {
        int Type = -1;
        switch(ElementNo) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 6 :
                Type = 2;
                break;
            default :
                Type = 1;
                break;
       }
        return Type;
    }
    
    /**
     *
     * @throws EDIexception
     */
    public void print() throws EDIexception {
        String []elements;
        String []compElements;
        int elementNo, compElementNo;
        String elementName;
        String elementData;
        String explanation;
        
        elements = UNBstring.split("\\+");
        System.out.println("UNB, INTERCHANGE HEADER");
        for (elementNo = 1; elements.length > elementNo; elementNo++) {
            if (1 == this.getElementType(elementNo)) {
                if (elements[elementNo].length() > 0) {
                    elementName = this.getElementName(elementNo);
                    elementData = "\"" + elements[elementNo] + "\""; 
                    explanation = this.getElementExplanation(elementNo);

                    System.out.format("%-12s %-20s %s\n", elementName, elementData, explanation);
                }
            } else {
                System.out.format("%s %s\n", this.getElementName(elementNo), this.getElementExplanation(elementNo));
                if (elements[elementNo].length() > 0) {
                    compElements = elements[elementNo].split(":");
                    for (compElementNo = 0; compElements.length > compElementNo; compElementNo++) {
                        elementName = this.getElementName(elementNo) + "." + this.getElementName(elementNo, compElementNo);
                        elementData = "\"" + compElements[compElementNo] + "\""; 
                        explanation = this.getElementExplanation(elementNo, compElementNo);
                        
                        System.out.format("  %-10s %-20s %s\n", elementName, elementData, explanation);
                    }
                }
            }
        }
    }
    
    /**
     *
     * @return
     * @throws EDIexception
     */
    public String getText() throws EDIexception {
       String Response;
       String Tmp = new String();
        String []elements;
        String []compElements;
        int elementNo, compElementNo;
        String elementName;
        String elementData;
        String explanation;
        
        elements = UNBstring.split("\\+");
        Response = "UNB, INTERCHANGE HEADER\n";
        
        for (elementNo = 1; elements.length > elementNo; elementNo++) {
            if (1 == this.getElementType(elementNo)) {
                if (elements[elementNo].length() > 0) {
                    elementName = this.getElementName(elementNo);
                    elementData = "\"" + elements[elementNo] + "\""; 
                    explanation = this.getElementExplanation(elementNo);
                    
                    Response = Response + elementName + "\t" + elementData + "\t" + explanation + "\n";

                    //System.out.format("%-12s %-20s %s\n", elementName, elementData, explanation);
                }
            } else {
                //System.out.format("%s %s\n", this.getElementName(elementNo), this.getElementExplanation(elementNo));
                Response = Response + this.getElementName(elementNo) + "\t" + this.getElementExplanation(elementNo) +"\n";
                if (elements[elementNo].length() > 0) {
                    compElements = elements[elementNo].split(":");
                    for (compElementNo = 0; compElements.length > compElementNo; compElementNo++) {
                        elementName = this.getElementName(elementNo) + "." + this.getElementName(elementNo, compElementNo);
                        elementData = "\"" + compElements[compElementNo] + "\""; 
                        explanation = this.getElementExplanation(elementNo, compElementNo);
                        
                        Response = Response + elementName + "\t" + elementData + "\t" + explanation + "\n";
                        //System.out.format("  %-10s %-20s %s\n", elementName, elementData, explanation);
                    }
                }
            }
        }
        return Response;
    }

    /**
     *
     * @param UNBstring
     * @throws EDIexception
     */
    public void print(String UNBstring) throws EDIexception {
        this.setUNBstring(UNBstring);
        this.print();
    }
    
    /**
     *
     * @throws EDIexception
     */
    public void printHTML() throws EDIexception {
        String []elements;
        String []compElements;
        String elementName;
        String elementData;
        String explanation;
        int elementNo, compElementNo;
        
        this.parse();
        elements = this.UNBstring.split("\\+");
        System.out.println("<table style=\"width:100%\">");
        System.out.println("<tr><th colspan=\"3\">UNB, INTERCHANGE HEADER</th></tr>");
        System.out.println("<tr><td colspan=\"3\" align=\"left\">" + this.UNBstring + "'</td></tr>");
        for (elementNo = 1; elementNo < elements.length; elementNo++) {
            if (1 == this.getElementType(elementNo)) {
                if (elements[elementNo].length() > 0) {
                    elementName = this.getElementName(elementNo);
                    elementData = elements[elementNo]; 
                    explanation = this.getElementExplanation(elementNo);

                    System.out.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>\n", elementName, elementData, explanation);
                }
            } else {
                System.out.format("<tr><th colspan=\"3\" align=\"left\">%s %s</th></tr>\n", this.getElementName(elementNo), this.getElementExplanation(elementNo));
                if (elements[elementNo].length() > 0) {
                    compElements = elements[elementNo].split(":");
                    for (compElementNo = 0; compElements.length > compElementNo; compElementNo++) {
                        elementName = this.getElementName(elementNo) + "." + this.getElementName(elementNo, compElementNo);
                        elementData = compElements[compElementNo]; 
                        explanation = this.getElementExplanation(elementNo, compElementNo);
                        
                        System.out.format("<tr><td>%s</td><td>%s</td><td>%s</td></tr>\n", elementName, elementData, explanation);
                    }
                }
            }
        }
        System.out.println("</table>");                
    } // printHTML()
    
    /**
     *
     * @param UNBstring
     * @throws EDIexception
     */
    public void printHTML(String UNBstring) throws EDIexception {
        this.setUNBstring(UNBstring);
        this.printHTML();
    }
    
    private void parse() throws EDIexception {
        int i, j;
        String[] elements;
        String[] comp_elements;
        
        if (this.UNBstring.length() < 5) {
            throw new EDIexception("UNB merkkijono '" + this.UNBstring + "' on liian lyhyt!");
        }
        elements = this.UNBstring.split("\\+");
        if (elements.length < 6) {
            throw new EDIexception("UNB segmentissä on liian vähän elementtejä!");
        }
        for (i=1; i < elements.length; i++) {
            switch (i) {
            case 1: 
                comp_elements = elements[i].split(":");
                for(j=0; j < comp_elements.length; j++) {
                    switch (j) {
                    case 0 : this.seteS001_0001(comp_elements[j]); break;
                    case 1 : this.seteS001_0002(comp_elements[j]); break;
                    case 3 : this.seteS001_0080(comp_elements[j]); break;
                    case 4 : this.seteS001_0133(comp_elements[j]); break;
                    }
                }
                break;
            case 2 : 
                comp_elements = elements[i].split(":");
                for (j=0; j < comp_elements.length; j++) {
                    switch (j) {
                    case 0 : this.seteS002_0004(comp_elements[j]); break;
                    case 1 : this.seteS002_0007(comp_elements[j]); break;
                    case 2 : this.seteS002_0008(comp_elements[j]); break;
                    case 3 : this.seteS002_0042(comp_elements[j]); break;
                    }
                }
                break;
            case 3 :
                comp_elements = elements[i].split(":");
                for (j=0; j < comp_elements.length; j++) {
                    switch (j) {
                    case 0 : this.seteS003_0007(comp_elements[j]); break;
                    case 1 : this.seteS003_0010(comp_elements[j]); break;
                    case 2 : this.seteS003_0014(comp_elements[j]); break;
                    case 3 : this.seteS003_0046(comp_elements[j]); break;
                    }
                }
                break;
            case 4 :
                comp_elements = elements[i].split(":");
                for (j=0; j < comp_elements.length; j++) {
                    switch (j) {
                    case 0 : this.seteS004_0017(comp_elements[j]); break;
                    case 1 : this.seteS004_0019(comp_elements[j]); break;
                    }
                }
                break;
            case 5 :
                this.setE0020(elements[i]);
                break;
            case 6 :
                comp_elements = elements[i].split(":");
                for (j=0; j < comp_elements.length; j++) {
                    switch (j) {
                    case 0 : this.seteS005_0022(comp_elements[j]);
                    case 1 : this.seteS005_0025(comp_elements[j]);
                    }
                }
                break;
            case 7 :
                this.setE0026(elements[i]);
                break;
            case 8 :
                this.setE0029(elements[i]);
                break;
            case 9 :
                this.setE0031(elements[i]);
                break;
            case 10 :
                this.setE0032(elements[i]);
                break;
            case 11 :
                this.setE0035(elements[i]);
                break;
            }
        }
    }
}
