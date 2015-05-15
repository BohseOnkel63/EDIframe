package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3239  Country of origin, coded  an..3
 * Country in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the Customs tariff, of quantitative restrictions, or of any other measure related to trade.
 */
public class E3239 extends Element {

    public E3239() {
        this(null);
    }

    public E3239(String Content) {
        super("3239", "Country of origin, coded", "an..3", "Country in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the Customs tariff, of quantitative restrictions, or of any other measure related to trade.", "See Country and currency codes (UNTDED) or ISO 3166 two alpha country code (Code set 3207).");
        this.setContent(Content);
    }
}

