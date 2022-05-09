package rijksmuseum.testData.artObjectDetails;

import rijksmuseum.model.objectMetaData.ArtObject;

import java.util.Arrays;

public class ArtObjectDetailsTestData {

    public static ArtObject getDefaultArtObjectNl() {
        return ArtObject.builder()
                .id("nl-SK-C-5")
                .objectNumber("SK-C-5")
                .language("nl")
                .title("De Nachtwacht")
                .titles(Arrays.asList("Officieren en andere schutters van wijk II in Amsterdam, onder leiding van kapitein Frans Banninck Cocq en luitenant Willem van Ruytenburch, bekend als ‘De Nachtwacht’",
                        "Het korporaalschap van kapitein Frans Banninck Cocq en luitenant Willem van Ruytenburch, bekend als de 'Nachtwacht'"))
                .description("Officieren en andere schutters van wijk II in Amsterdam onder leiding van kapitein Frans Banninck Cocq en luitenant Willem van Ruytenburch, sinds het einde van de 18de eeuw bekend als ‘De Nachtwacht’. Schutters van de Kloveniersdoelen uit een poort naar buiten tredend. Op een schild aangebracht naast de poort staan de namen van de afgebeelde personen: Frans Banning Cocq, heer van purmerlant en Ilpendam, Capiteijn Willem van Ruijtenburch van Vlaerdingen, heer van Vlaerdingen, Lu[ij]tenant, Jan Visscher Cornelisen Vaendrich, Rombout Kemp Sergeant, Reijnier Engelen Sergeant, Barent Harmansen, Jan Adriaensen Keyser, Elbert Willemsen, Jan Clasen Leydeckers, Jan Ockersen, Jan Pietersen bronchorst, Harman Iacobsen wormskerck, Jacob Dircksen de Roy, Jan vander heede, Walich Schellingwou, Jan brugman, Claes van Cruysbergen, Paulus Schoonhoven. De schutters zijn gewapend met onder anderen pieken, musketten en hellebaarden. Rechts de tamboer met een grote trommel. Tussen de soldaten links staat een meisje met een dode kip om haar middel, rechts een blaffende hond. Linksboven de vaandrig met de uitgestoken vaandel.")
                .principalMaker("Rembrandt van Rijn")
                .build();
        //TODO: here could be added all necessary fields
    }

    public static ArtObject getDefaultArtObjectEn() {
        return ArtObject.builder()
                .id("en-SK-C-5")
                .objectNumber("SK-C-5")
                .language("en")
                .title("The Night Watch")
                .titles(Arrays.asList("Officers and other civic guardsmen of District II in Amsterdam, under the command of Captain Frans Banninck Cocq and Lieutenant Willem van Ruytenburch, known as ‘The Night Watch’",
                        "The company of Captain Frans Banninck Cocq and Lieutenant Willem van Ruytenburch, known as 'The nightwatch'"))
                .description("Officieren en andere schutters van wijk II in Amsterdam onder leiding van kapitein Frans Banninck Cocq en luitenant Willem van Ruytenburch, sinds het einde van de 18de eeuw bekend als ‘De Nachtwacht’. Schutters van de Kloveniersdoelen uit een poort naar buiten tredend. Op een schild aangebracht naast de poort staan de namen van de afgebeelde personen: Frans Banning Cocq, heer van purmerlant en Ilpendam, Capiteijn Willem van Ruijtenburch van Vlaerdingen, heer van Vlaerdingen, Lu[ij]tenant, Jan Visscher Cornelisen Vaendrich, Rombout Kemp Sergeant, Reijnier Engelen Sergeant, Barent Harmansen, Jan Adriaensen Keyser, Elbert Willemsen, Jan Clasen Leydeckers, Jan Ockersen, Jan Pietersen bronchorst, Harman Iacobsen wormskerck, Jacob Dircksen de Roy, Jan vander heede, Walich Schellingwou, Jan brugman, Claes van Cruysbergen, Paulus Schoonhoven. De schutters zijn gewapend met onder anderen pieken, musketten en hellebaarden. Rechts de tamboer met een grote trommel. Tussen de soldaten links staat een meisje met een dode kip om haar middel, rechts een blaffende hond. Linksboven de vaandrig met de uitgestoken vaandel.")
                .principalMaker("Rembrandt van Rijn")
                .build();
        //TODO: here could be added all necessary fields
    }

    public static ArtObject getArtObjectWithWrongObjectNumber() {
        return ArtObject.builder()
                .objectNumber("SK-C-55")
                .language("nl")
                .build();
    }

    public static ArtObject getArtObjectWithWrongLanguage() {
        return ArtObject.builder()
                .objectNumber("SK-C-55")
                .language("eng")
                .build();
    }

    //TODO: here could be added all necessary Art Object Details

}
