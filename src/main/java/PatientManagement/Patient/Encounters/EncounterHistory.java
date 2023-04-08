/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement.Patient.Encounters;

import PatientManagement.Clinic.Event;
import PatientManagement.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EncounterHistory {
    ArrayList<Encounter> encounters;
    Patient patient;

    public EncounterHistory(Patient p) {
        patient = p;

    }

    // each encounter must link to the event at the site
    public Encounter newEncounter(Patient p, String chiefcomplaint, Event ev) {
        Encounter e = new Encounter(p, chiefcomplaint, ev);
        encounters.add(e);
        patient = p;
        return e;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounters;
    }

}
