import java.util.Scanner;

public class VisitorPattern {
    /*
     * creating a man object
     * and creating a problem object and pass into the method of the problem class
     */
    public static void main(String[] args) {

        People man = new People();
        Scanner scan = new Scanner(System.in);
        System.out.println("Mention the Problem");
        String typePrb = scan.next();
        Problem prb = new Problem();
        man.problemHappens(prb, typePrb);

        scan.close();

    }

}

/*
 * people class
 * 
 * @param prb, typrPrb
 */
class People {
    public void problemHappens(Problem prb, String typePrb) {
        try {
            prb.problemType(typePrb);
        } catch (ProblemException e) {

            // e.printStackTrace();
            e.visit();
        }

    }
}

/*
 * Problem class
 * 
 * @param typePrb
 * 
 * @throws ProblemException.
 */

class Problem {
    public void problemType(String typePrb) throws ProblemException {

        if (typePrb.equals("fire")) {
            throw new FireProblemException("There is fire accident ");

        } else if (typePrb.equals("accident")) {
            throw new AccidentProblemException("There is ");

        } else if (typePrb.equals("crime")) {
            throw new CrimeProblemException("There is crime in city");

        }
    }
}

abstract class Service911 {
    public abstract void handle(FireProblemException fp);

    public abstract void handle(AccidentProblemException ap);

    public abstract void handle(CrimeProblemException cp);
}

/*
 * This is the handeler service class which will handel the exception thrown by
 * the Problem class
 */
class HandlerService extends Service911 {

    @Override
    public void handle(FireProblemException fp) {
        System.out.println("We will send Fire Service to your current location ");
    }

    @Override
    public void handle(AccidentProblemException ap) {
        System.out.println("We will  send Ambulance to your current location ");
    }

    @Override
    public void handle(CrimeProblemException cp) {
        System.out.println("We will send Police to your current location ");
    }

}

/*
 * custom Exception FireProblemException, AccidentProblemException,
 * CrimeProblemException
 * with a visit() method which will visit the handeler service and provide the
 * services related to that problem
 */

abstract class ProblemException extends Exception {
    public abstract void visit();
}

class FireProblemException extends ProblemException {

    String msg;

    public FireProblemException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }

    @Override
    public void visit() {
        HandlerService handel = new HandlerService();
        handel.handle(this);
    }

}

class AccidentProblemException extends ProblemException {

    String msg;

    public AccidentProblemException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }

    @Override
    public void visit() {
        HandlerService handel = new HandlerService();
        handel.handle(this);

    }

}

class CrimeProblemException extends ProblemException {

    String msg;

    public CrimeProblemException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }

    @Override
    public void visit() {
        HandlerService handel = new HandlerService();
        handel.handle(this);

    }

}