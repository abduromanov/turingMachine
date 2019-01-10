package turingmachine;

public final class setTuringMachine {

    private setTuringMachine() {

    }

    public static TuringMachine addition() {
        TuringMachine newTM = new TuringMachine();
        newTM.addState("q0");
        newTM.addState("q1");
        newTM.addState("q2");
        newTM.addState("q3");
        newTM.addState("q4");
        newTM.addState("q5");
        newTM.addState("qa");
        newTM.addState("qr");
        newTM.setStateAwal("q0");
        newTM.setFinalState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", "0", "q1", "X", "R");
        newTM.addTransition("q0", "1", "q5", "B", "R");
        newTM.addTransition("q1", "0", "q1", "0", "R");
        newTM.addTransition("q1", "1", "q2", "1", "R");
        newTM.addTransition("q2", "0", "q2", "0", "R");
        newTM.addTransition("q2", "B", "q3", "0", "L");
        newTM.addTransition("q3", "0", "q3", "0", "L");
        newTM.addTransition("q3", "1", "q4", "1", "L");
        newTM.addTransition("q4", "0", "q4", "0", "L");
        newTM.addTransition("q4", "X", "q0", "X", "R");
        newTM.addTransition("q5", "0", "qa", "0", "R");
        return newTM;
    }

    public static TuringMachine subtraction() {
        TuringMachine newTM = new TuringMachine();
        newTM.addState("q0");
        newTM.addState("q1");
        newTM.addState("q2");
        newTM.addState("q3");
        newTM.addState("q4");
        newTM.addState("q5");
        newTM.addState("q6");
        newTM.addState("qa");
        newTM.addState("qr");
        newTM.setStateAwal("q0");
        newTM.setFinalState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", "0", "q1", "X", "R");
        newTM.addTransition("q0", "1", "q5", "X", "R");
        newTM.addTransition("q1", "0", "q1", "0", "R");
        newTM.addTransition("q1", "1", "q2", "1", "R");
        newTM.addTransition("q2", "0", "q3", "X", "L");
        newTM.addTransition("q2", "X", "q2", "X", "R");
        newTM.addTransition("q3", "1", "q4", "1", "L");
        newTM.addTransition("q3", "X", "q3", "X", "L");
        newTM.addTransition("q4", "0", "q4", "0", "L");
        newTM.addTransition("q4", "X", "q0", "X", "R");
        newTM.addTransition("q5", "0", "q6", "0", "R");
        newTM.addTransition("q5", "X", "q5", "X", "R");
        newTM.addTransition("q6", "B", "qa", "B", "L");
        return newTM;
    }
    
    public static TuringMachine multi(){
        TuringMachine newTM = new TuringMachine();
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
        newTM.setStateAwal("q0");
        newTM.setFinalState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", "0", "q1", "X", "R");
        newTM.addTransition("q0", "1", "q7", "X", "R");
        newTM.addTransition("q1", "0", "q1", "0", "R");
        newTM.addTransition("q1", "1", "q2", "1", "R");
        newTM.addTransition("q2", "0", "q3", "X", "R");
        newTM.addTransition("q2", "1", "q5", "1", "L");
        newTM.addTransition("q3", "1", "q3", "1", "R");
        newTM.addTransition("q3", "0", "q3", "0", "R");
        newTM.addTransition("q3", "B", "q4", "0", "L");
        newTM.addTransition("q4", "0", "q4", "0", "L");
        newTM.addTransition("q4", "1", "q4", "1", "L");
        newTM.addTransition("q4", "X", "q2", "X", "R");
        newTM.addTransition("q5", "X", "q5", "0", "L");
        newTM.addTransition("q5", "1", "q6", "1", "L");
        newTM.addTransition("q6", "0", "q6", "0", "L");
        newTM.addTransition("q6", "X", "q0", "X", "R");
        newTM.addTransition("q7", "0", "q7", "X", "R");
        newTM.addTransition("q7", "1", "q8", "X", "R");
        newTM.addTransition("q8", "0", "qa", "0", "R");
        return newTM;
    }

    public static TuringMachine div() {
        TuringMachine newTM = new TuringMachine();
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
        newTM.setStateAwal("q0");
        newTM.setFinalState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q0", "0", "q1", "X", "R");
        newTM.addTransition("q0", "1", "q5", "1", "R");
        newTM.addTransition("q1", "0", "q1", "0", "R");
        newTM.addTransition("q1", "1", "q2", "1", "R");
        newTM.addTransition("q2", "0", "q2", "0", "R");
        newTM.addTransition("q2", "X", "q2", "X", "L");
        newTM.addTransition("q2", "1", "q3", "1", "R");
        newTM.addTransition("q3", "0", "q4", "X", "L");
        newTM.addTransition("q3", "1", "q9", "B", "L");
        newTM.addTransition("q4", "0", "q4", "0", "L");
        newTM.addTransition("q4", "1", "q4", "1", "L");
        newTM.addTransition("q4", "X", "q0", "X", "R");
        newTM.addTransition("q5", "1", "q5", "1", "R");
        newTM.addTransition("q5", "0", "q5", "0", "R");
        newTM.addTransition("q5", "X", "q5", "X", "R");
        newTM.addTransition("q5", "B", "q6", "0", "L");
        newTM.addTransition("q6", "1", "q7", "1", "L");
        newTM.addTransition("q6", "0", "q6", "0", "L");
        newTM.addTransition("q7", "X", "q7", "X", "L");
        newTM.addTransition("q7", "0", "q7", "0", "L");
        newTM.addTransition("q7", "1", "q8", "1", "L");
        newTM.addTransition("q8", "X", "q8", "0", "L");
        newTM.addTransition("q8", "B", "q0", "B", "R");
        newTM.addTransition("q9", "0", "q9", "B", "L");
        newTM.addTransition("q9", "X", "q9", "B", "L");
        newTM.addTransition("q9", "B", "q10", "B", "R");
        newTM.addTransition("q10", "B", "q10", "B", "R");
        newTM.addTransition("q10", "X", "q10", "B", "R");
        newTM.addTransition("q10", "1", "q11", "B", "R");
        newTM.addTransition("q11", "0", "qa", "0", "R");
        return newTM;
    }

    public static TuringMachine factorial() {
        TuringMachine newTM = new TuringMachine();
        System.out.println("Belum tersedia!");
        return newTM;
    }
}
