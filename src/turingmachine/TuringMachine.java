/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

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
    private String cekState;
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
        cekState = "";
        index = 0;
    }

    public void execute(String input) {
        cekState = stateAwal;
        Tape = input;
        Transition trans = null;
        while (!cekState.equalsIgnoreCase(AcceptState)) {
            String[] tmp = Tape.split("");
            Iterator<Transition> iterator = jumlahTransisi.iterator();
            while (iterator.hasNext()) {
                trans = iterator.next();
                if (trans.bacaState.equalsIgnoreCase(cekState) && trans.bacaSimbol.equalsIgnoreCase(tmp[index])) {
                    tmp[index] = trans.gantiSimbol;
                    if (trans.arahTape.equalsIgnoreCase("R")) {
                        index++;
                    } else if (trans.arahTape.equalsIgnoreCase("L")) {
                        index--;
                        if (index < 0) {
                            index = 0;
                        }
                    }
                    cekState = trans.stateSetelah;
                    break;
                }
            }

            input = printResult(tmp);
            System.out.println(input 
                    + " | state : " + trans.bacaState 
                    + " next : " + tmp[index] 
                    + " next State: " + trans.stateSetelah 
                    + " dir : " + trans.arahTape);
            Tape = input;
            
            if (cekState.equalsIgnoreCase(AcceptState)) {
                System.out.println("Accepted");
                break;
            }
        }
    }

    public String printResult(String[] result) {
        String print = "";
        for (String result1 : result) {
            print += result1;
        }
        return print;
    }

    public void addState(String stateBaru) {
        if (!jumlahState.contains(stateBaru)) {
            jumlahState.add(stateBaru);
        }
    }

    public void setStateAwal(String stateAwalBaru) {
        if (jumlahState.contains(stateAwalBaru)) {
            stateAwal = stateAwalBaru;
        }
    }

    public void setFinalState(String stateFinalBaru) {
        if (jumlahState.contains(stateFinalBaru) && !RejectState.equals(stateFinalBaru)) {
            AcceptState = stateFinalBaru;
        }
    }

    public void setRejectState(String stateTolakBaru) {
        if (jumlahState.contains(stateTolakBaru) && !AcceptState.equals(stateTolakBaru)) {
            RejectState = stateTolakBaru;
        }
    }

    public void addTransition(String bacaState, String bacaSimbol, String stateSetelah, String gantiSimbol, String arahTape) {
        boolean check = false;
        if (!jumlahState.contains(bacaState) && !jumlahState.contains(stateSetelah)) {
            Iterator<Transition> TransitionsIterator = jumlahTransisi.iterator();
            while (TransitionsIterator.hasNext() && check == false) {
                Transition nextTransition = TransitionsIterator.next();
                if (nextTransition.check(bacaState, bacaSimbol)) {
                    check = true;
                    break;
                }
            }
        }

        if (!check) {
            Transition tambahTrans = new Transition();
            tambahTrans.bacaState = bacaState;
            tambahTrans.bacaSimbol = bacaSimbol;
            tambahTrans.stateSetelah = stateSetelah;
            tambahTrans.gantiSimbol = gantiSimbol;
            tambahTrans.arahTape = arahTape;
            jumlahTransisi.add(tambahTrans);
        }
    }
}
