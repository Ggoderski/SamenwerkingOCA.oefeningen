

    // constructor voorbeeld.
//Elke klasse kan één of meerdere constructors hebben, en als er geen constructor is gedefinieerd, dan wordt er automatisch een lege (no-arg) constructor toegevoegd door de compiler.
//
//Constructors hebben dezelfde naam als de klasse en hebben geen return type.
//
//Constructors kunnen argumenten hebben en worden aangeroepen met de new operator.
//
//Als er meerdere constructors zijn gedefineerd, dan kan de juiste constructor worden gekozen door de parameters die worden meegegeven.
//
//In een constructor kan de this keyword worden gebruikt om verwijzingen te maken naar andere constructors of objectvelden.
//
//Het is ook mogelijk om een constructor te maken die verplicht is om een bepaalde parameter mee te geven, en/of om de waarden van de objectvelden te initialiseren.
//
//Constructors kunnen ook worden gebruikt om objecten in een bepaalde staat te zetten door de juiste velden in te stellen en/of door methoden aan te roepen.
//
//Constructors worden altijd aangeroepen wanneer een nieuw object wordt aangemaakt en moeten altijd compleet zijn voordat andere methoden kunnen worden aangeroepen op het object.

    public class ConstructorExp {
        private String naam;
        private int leeftijd;
        private String opleiding;
        private float cijferGemiddelde;
        // voorbeeld van een constructor.

        public  ConstructorExp (String naam, int leeftijd, String opleiding) {
            this.naam = naam;
            this.leeftijd = leeftijd;
            this.opleiding = opleiding;
            this.cijferGemiddelde = 0.0f;
        }

        public void setNaam(String naam) {
            this.naam = naam;
        }

        public void setLeeftijd(int leeftijd) {
            this.leeftijd = leeftijd;
        }

        public void setOpleiding(String opleiding) {
            this.opleiding = opleiding;
        }

        public void setCijferGemiddelde(float cijferGemiddelde) {
            this.cijferGemiddelde = cijferGemiddelde;
        }

        public String getNaam() {
            return naam;
        }

        public int getLeeftijd() {
            return leeftijd;
        }

        public String getOpleiding() {
            return opleiding;
        }

        public float getCijferGemiddelde() {
            return cijferGemiddelde;
        }

        public static void main(String[] args) {
            ConstructorExp s = new ConstructorExp ("Alex", 30, "Java dev");
            System.out.println("Students naam is" + " " + s.getNaam());
            System.out.println("Students leeftijd is" + " " + s.getLeeftijd());
            System.out.println("Students opleiding is" + " " + s.getOpleiding());
        }
    }

