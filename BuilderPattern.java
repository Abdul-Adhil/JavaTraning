public class BuilderPattern {
    public static void main(String[] args) {
        /*
         * This main method create a bike object using the bike builder with custom
         * value we set like cc, mirror, seat
         */
        // Bike b = new BikeBuilder().setCc(150).getBike();
        Bike b = new Bike.BikeBuilder().setCc(150).getBike();
        System.out.println(b);

    }

}

// class BikeBuilder {

// private String colour;
// private String mirror;
// private String seat;
// private String protection;
// private String tyre;
// private int cc;

// public BikeBuilder setColour(String colour) {
// this.colour = colour;

// return this;
// }

// public BikeBuilder setMirror(String mirror) {
// this.mirror = mirror;
// return this;
// }

// public BikeBuilder setSeat(String seat) {
// this.seat = seat;
// return this;
// }

// public BikeBuilder setProtection(String protection) {
// this.protection = protection;
// return this;
// }

// public BikeBuilder setTyre(String tyre) {
// this.tyre = tyre;
// return this;
// }

// public BikeBuilder setCc(int cc) {
// this.cc = cc;
// return this;
// }

// public Bike getBike() {
// return new Bike(colour, mirror, seat, protection, tyre, cc);
// }
// }

/*
 * This is a bike class which has
 * 
 * @param colour,mirror,seat,protection,tyre,cc
 * 
 * @return Bike object in toString method
 */
class Bike {

    private String colour;
    private String mirror;
    private String seat;
    private String protection;
    private String tyre;
    private int cc;

    public Bike(String colour, String mirror, String seat, String protection, String tyre, int cc) {
        super();
        this.colour = colour;
        this.mirror = mirror;
        this.seat = seat;
        this.protection = protection;
        this.tyre = tyre;
        this.cc = cc;

    }

    @Override
    public String toString() {
        return "Bike [colour=" + colour + ", mirror=" + mirror + ", seat=" + seat + ", protection=" + protection
                + ", tyre=" + tyre + ", cc=" + cc + "]";
    }

    /*
     * This is a bike builder which has setters to the variable
     * 
     * @return bike object to main
     */
    static class BikeBuilder {

        private String colour;
        private String mirror;
        private String seat;
        private String protection;
        private String tyre;
        private int cc;

        public BikeBuilder setColour(String colour) {
            this.colour = colour;

            return this;
        }

        public BikeBuilder setMirror(String mirror) {
            this.mirror = mirror;
            return this;
        }

        public BikeBuilder setSeat(String seat) {
            this.seat = seat;
            return this;
        }

        public BikeBuilder setProtection(String protection) {
            this.protection = protection;
            return this;
        }

        public BikeBuilder setTyre(String tyre) {
            this.tyre = tyre;
            return this;
        }

        public BikeBuilder setCc(int cc) {
            this.cc = cc;
            return this;
        }

        public Bike getBike() {
            return new Bike(colour, mirror, seat, protection, tyre, cc);
        }
    }

}
