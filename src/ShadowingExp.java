

    // Shadowing voorbeeld

    class BaseClass {
        // void printValues() {
        int x = 10;  // class level variable
        //System.out.println("Base x: " + x);
    }
//}

    class ChildClass extends BaseClass {
        int x = 20;  // class level variable, shadows base class variable x
        void printValues() {
            System.out.println("Child x: " + x);
            System.out.println("Base x: " + super.x);
        }
    }

    public class ShadowingExp {
        public static void main(String[] args) {
            ChildClass obj = new ChildClass();
            BaseClass ob1 = new BaseClass();
            obj.printValues();
        }
    }


