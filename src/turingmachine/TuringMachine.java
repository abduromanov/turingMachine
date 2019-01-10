/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Hafiz Abd
 */
public class TuringMachine {

    private final Set<String> jumlahState;
    private final Set<Transition> jumlahTransisi;
    private String stateAwal;
    private String AcceptState;
    private String RejectState;

    private String Tape;
    private String CurrentState;
    private int index;

    class Transition {

        String bacaState;
        String bacaSimbol;
        String stateSetelah;
        String gantiSimbol;
        String arahTape;

        boolean check(String state, String symbol) {
            return state.equals(bacaState) && symbol.equals(bacaSimbol);
        }
    }

    public TuringMachine() {
        jumlahState = new HashSet<>();
        jumlahTransisi = new HashSet<>();
        stateAwal = "";
        AcceptState = "";
        RejectState = "";
        Tape = "";
        CurrentState = "";
        index = 0;
    }

    public void execute(String input) {
        CurrentState = stateAwal;
        Tape = input;
        String print = "";
        Transition trans;
        boolean accept = false;
        while (true) {
            String[] tmp = Tape.split("(?!^)");
            System.out.println(tmp[0]+tmp[1]);
            Iterator<Transition> iterator = jumlahTransisi.iterator();
            while (iterator.hasNext()) {
                trans = iterator.next();
                if (trans.bacaState.equalsIgnoreCase(CurrentState) && trans.bacaSimbol.equalsIgnoreCase(tmp[index])) {
                    tmp[index] = trans.gantiSimbol;
                    if (trans.arahTape.equalsIgnoreCase("R")) {
                        index++;
                    } else if (trans.arahTape.equalsIgnoreCase("L")) {
                        index--;
//                        if (index < 0) {
//                            index = 0;
//                        }
                    } else if (trans.bacaState.equalsIgnoreCase(AcceptState)) {
                        accept = true;
                    }
                    CurrentState = trans.stateSetelah;
                    break;
                }
                if (!accept) {
                    input = printResult(tmp, "");
                    System.out.println(input + " AT state " + trans.bacaState + " index : " + index + " next : " + tmp[index]);
                }
            }
//            for (int i = 0; i < jumlahTransisi.size(); i++) {
//                if (trans.bacaState.equals(CurrentState) && trans.bacaSimbol.equals(tmp[index])) {
//                    tmp[index] = trans.stateSetelah;
//                    if (trans.arahTape.equals("R")) {
//                        index++;
//                    } else if (trans.arahTape.equals("L")) {
//                        index--;
//                    }
//                    CurrentState = trans.stateSetelah;
//                    break;
//                }
//                if (accept) {
//                    input = printResult(tmp, "");
//                    break;
//                } else {
//                    input = printResult(tmp, "");
//                    System.out.println(input + " State : " + CurrentState + " move to : " + trans.bacaState + " " + tmp[index]);
//                }
//            }
        }
    }

    public String printResult(String[] result, String delim) {
        String print = "";
        for (int i = 0; i < result.length; i++) {
            if (i != 0) {
                print += delim;
            }
            print += result[i];
        }
        return print;
    }

    public void addState(String newState) {
        if (!jumlahState.contains(newState)) {
            jumlahState.add(newState);
        }
    }

    public void setStateAwal(String newStartState) {
        if (jumlahState.contains(newStartState)) {
            stateAwal = newStartState;
        }
    }

    public void setAcceptState(String newAcceptState) {
        if (jumlahState.contains(newAcceptState) && !RejectState.equals(newAcceptState)) {
            AcceptState = newAcceptState;
        }
    }

    public void setRejectState(String newRejectState) {
        if (jumlahState.contains(newRejectState) && !AcceptState.equals(newRejectState)) {
            RejectState = newRejectState;
        }
    }

    public void addTransition(String currentState, String currentSymbol, String nextState, String replace, String direction) {
//        boolean check = false;
//        if (!jumlahState.contains(currentState) && !jumlahState.contains(nextState)) {
//            Iterator<Transition> TransitionsIterator = jumlahTransisi.iterator();
//            while (TransitionsIterator.hasNext() && check == false) {
//                Transition nextTransition = TransitionsIterator.next();
//                if (nextTransition.check(currentState, currentSymbol)) {
//                    check = true;
//                    break;
//                }
//            }
//        }
//
//        if (!check) {
        Transition newTransition = new Transition();
        newTransition.bacaState = currentState;
        newTransition.bacaSimbol = currentSymbol;
        newTransition.stateSetelah = nextState;
        newTransition.gantiSimbol = replace;
        newTransition.arahTape = direction;
        jumlahTransisi.add(newTransition);
//        }
    }
}
