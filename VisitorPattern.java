import java.util.Scanner;

public class VisitorPattern {
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