

    // override voorbeeld.
//De methode in de kind-klasse moet dezelfde signatuur
//(naam, retourneer type en argumenten) hebben als de methode in de ouder-klasse.

    public class OverrideExp {
        public static void main(String[] args) {
            Dier dier = new Dier();
            Dier hond = new Hond();
            Dier kat = new Kat();
            Dier vogel = new Vogel();

            hond.maakGeluid();
            vogel.maakGeluid();
            kat.maakGeluid();
            dier.maakGeluid();


        }
    }

    class Dier {
        void maakGeluid() {
            System.out.println("Dier maakt geluid");
        }
    }

    class Hond extends Dier {
        @Override
        void maakGeluid() {
            System.out.println("Hond blaft");
        }
    }

    class Kat extends Dier {
        @Override
        void maakGeluid() {
            System.out.println("Kat miauwt");
        }
    }

    class Vogel extends Dier {
        @Override
        void maakGeluid() {
            System.out.println("Vogel tjilpt");
        }
    }

