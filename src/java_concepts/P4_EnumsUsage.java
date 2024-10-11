package java_concepts;

public class P4_EnumsUsage {
    

    /* In Java, enum is a special data type that enables you to define a set of named constants. */
    /* Basic enum declaration This type of enums can be used in the switch case statements  */
    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESSDAY, THURSDAY, FRIDAY, SATURDAY}

    /* enums can have fields and methods. This allows you to associate additional data and behavior with the enum constants. */

    /*  enum Planet{
        MERCURY(3.303e+20, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.378e6),
        MARS(6.421e+23, 3.3972e6);

    private final double mass;   // in kilograms
    private final double radius;  // in meters

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
    } */
   
    enum MathOperation{
        sum(10, 5),
        multiply(10, 5);

        private int a;
        private int b;
        MathOperation(int a, int b){
            this.a = a;
            this.b = b;
        }

        public double getSum() {
            return a+b;
        }
        public double getMultiply() {
            return a*b;
        }
    }
    
    public static void main(String[] args) {
        Day day = Day.SUNDAY;

        System.out.println(day);

        // for (Planet planet : Planet.values()) {
        //     System.out.println(planet + ": Mass = " + planet.getMass() + ", Radius = " + planet.getRadius());
        // }

        // System.out.println(Planet.MERCURY + " :"+ Planet.MERCURY.getMass()+ ": "+ Planet.MERCURY.getRadius());
        System.out.println(MathOperation.sum+": "+MathOperation.sum.getSum());
        System.out.println(MathOperation.multiply+": "+MathOperation.multiply.getSum());
    }
    
}
