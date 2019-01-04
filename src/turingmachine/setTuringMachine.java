package turingmachine;

public final class setTuringMachine {

    private setTuringMachine() {

    }

    public static TuringProccess addition() {
        TuringProccess newTM = new TuringProccess();
        newTM.addState("q0");
        newTM.addState("q1");
        newTM.addState("q2");
        newTM.addState("q3");
        newTM.addState("q4");
        newTM.addState("q5");
        newTM.addState("qa");
        newTM.addState("qr");
        newTM.setStartState("q0");
        newTM.setAcceptState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", '0', "q1", 'X', true);
        newTM.addTransition("q0", '1', "q5", 'B', true);
        newTM.addTransition("q1", '0', "q1", '0', true);
        newTM.addTransition("q1", '1', "q2", '1', true);
        newTM.addTransition("q2", '0', "q2", '0', true);
        newTM.addTransition("q2", 'B', "q3", '0', false);
        newTM.addTransition("q3", '0', "q3", '0', false);
        newTM.addTransition("q3", '1', "q4", '1', false);
        newTM.addTransition("q4", '0', "q4", '0', false);
        newTM.addTransition("q4", 'X', "q0", 'X', true);
        newTM.addTransition("q5", '0', "qa", '0', true);
        return newTM;
    }

    public static TuringProccess subtraction() {
        TuringProccess newTM = new TuringProccess();
        newTM.addState("q0");
        newTM.addState("q1");
        newTM.addState("q2");
        newTM.addState("q3");
        newTM.addState("q4");
        newTM.addState("q5");
        newTM.addState("q6");
        newTM.addState("qa");
        newTM.addState("qr");
        newTM.setStartState("q0");
        newTM.setAcceptState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", '0', "q1", 'X', true);
        newTM.addTransition("q0", '1', "q5", 'X', true);
        newTM.addTransition("q1", '0', "q1", '0', true);
        newTM.addTransition("q1", '1', "q2", '1', true);
        newTM.addTransition("q2", '0', "q3", 'X', false);
        newTM.addTransition("q2", 'X', "q2", 'X', true);
        newTM.addTransition("q3", '1', "q4", '1', false);
        newTM.addTransition("q3", 'X', "q3", 'X', false);
        newTM.addTransition("q4", '0', "q4", '0', false);
        newTM.addTransition("q4", 'X', "q0", 'X', true);
        newTM.addTransition("q5", '0', "q6", '0', true);
        newTM.addTransition("q5", 'X', "q5", 'X', true);
        newTM.addTransition("q6", 'B', "qa", 'B', false);
        return newTM;
    }
    
    public static TuringProccess multi(){
        TuringProccess newTM = new TuringProccess();
        newTM.addState("q0");
        newTM.addState("q1");
        newTM.addState("q2");
        newTM.addState("q3");
        newTM.addState("q4");
        newTM.addState("q5");
        newTM.addState("q6");
        newTM.addState("q7");
        newTM.addState("q8");
        newTM.addState("qa");
        newTM.addState("qr");
        newTM.setStartState("q0");
        newTM.setAcceptState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", '0', "q1", 'X', true);
        newTM.addTransition("q0", '1', "q7", 'X', true);
        newTM.addTransition("q1", '0', "q1", '0', true);
        newTM.addTransition("q1", '1', "q2", '1', true);
        newTM.addTransition("q2", '0', "q3", 'X', true);
        newTM.addTransition("q2", '1', "q5", '1', false);
        newTM.addTransition("q3", '1', "q3", '1', true);
        newTM.addTransition("q3", '0', "q3", '0', true);
        newTM.addTransition("q3", 'B', "q4", '0', false);
        newTM.addTransition("q4", '0', "q4", '0', false);
        newTM.addTransition("q4", '1', "q4", '1', false);
        newTM.addTransition("q4", 'X', "q2", 'X', true);
        newTM.addTransition("q5", 'X', "q5", '0', false);
        newTM.addTransition("q5", '1', "q6", '1', false);
        newTM.addTransition("q6", '0', "q6", '0', false);
        newTM.addTransition("q6", 'X', "q0", 'X', true);
        newTM.addTransition("q7", '0', "q7", 'X', true);
        newTM.addTransition("q7", '1', "q8", 'X', true);
        newTM.addTransition("q8", '0', "qa", '0', true);
        return newTM;
    }

    public static TuringProccess div() {
        TuringProccess newTM = new TuringProccess();
        newTM.addState("q0");
        newTM.addState("q1");
        newTM.addState("q2");
        newTM.addState("q3");
        newTM.addState("q4");
        newTM.addState("q5");
        newTM.addState("q6");
        newTM.addState("q7");
        newTM.addState("q8");
        newTM.addState("q9");
        newTM.addState("q10");
        newTM.addState("q11");
        newTM.addState("qa");
        newTM.addState("qr");
        newTM.setStartState("q0");
        newTM.setAcceptState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", '0', "q1", 'X', true);
        newTM.addTransition("q0", '1', "q5", '1', true);
        newTM.addTransition("q1", '0', "q1", '0', true);
        newTM.addTransition("q1", '1', "q2", '1', true);
        newTM.addTransition("q2", '0', "q2", '0', true);
        newTM.addTransition("q2", 'X', "q2", 'X', false);
        newTM.addTransition("q2", '1', "q3", '1', true);
        newTM.addTransition("q3", '0', "q4", 'X', false);
        newTM.addTransition("q3", '1', "q9", 'B', false);
        newTM.addTransition("q4", '0', "q4", '0', false);
        newTM.addTransition("q4", '1', "q4", '1', false);
        newTM.addTransition("q4", 'X', "q0", 'X', true);
        newTM.addTransition("q5", '1', "q5", '1', true);
        newTM.addTransition("q5", '0', "q5", '0', true);
        newTM.addTransition("q5", 'X', "q5", 'X', true);
        newTM.addTransition("q5", 'B', "q6", '0', false);
        newTM.addTransition("q6", '1', "q7", '1', false);
        newTM.addTransition("q6", '0', "q6", '0', false);
        newTM.addTransition("q7", 'X', "q7", 'X', false);
        newTM.addTransition("q7", '0', "q7", '0', false);
        newTM.addTransition("q7", '1', "q8", '1', false);
        newTM.addTransition("q8", 'X', "q8", '0', false);
        newTM.addTransition("q8", 'B', "q0", 'B', true);
        newTM.addTransition("q9", '0', "q9", 'B', false);
        newTM.addTransition("q9", 'X', "q9", 'B', false);
        newTM.addTransition("q9", 'B', "q10", 'B', true);
        newTM.addTransition("q10", 'B', "q10", 'B', true);
        newTM.addTransition("q10", 'X', "q10", 'B', true);
        newTM.addTransition("q10", '1', "q11", 'B', true);
        newTM.addTransition("q11", '0', "qa", '0', true);
        return newTM;
    }

    static TuringProccess factorial() {
        TuringProccess newTM = new TuringProccess();
        System.out.println("Belum tersedia!");
        return newTM;
    }
}
