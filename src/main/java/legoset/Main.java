package legoset;

import jaxb.JAXBHelper;

import javax.xml.bind.annotation.XmlAttribute;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{

        LegoSet legoset = new LegoSet();
        legoset.setNumber(75211);
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);

        Set<String> tags = new HashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoset.setTags(tags);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(1,"Imperial Pilot"));
        minifigs.add(new Minifig(1,"Mimban Stormtrooper"));
        legoset.setMinifigs(minifigs);

        List<Weight> weight = new ArrayList<Weight>();
        weight.add(new Weight(0.89,"kg"));
        legoset.setWeight(weight);

        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoset,System.out);
    }
}
