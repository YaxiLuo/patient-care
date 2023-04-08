/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement.Patient.Encounters;

import PatientManagement.Clinic.Event;
import PatientManagement.Patient.Patient;

/**
 *
 * @author kal bugrara
 * 
 */
// vorder = encounter.newVaccinationOrder();
// vacorder.newVaccination();

public class Encounter {
    Patient patient;
    String chiefComplaint;
    Diagnosis diagnosis;
    Event event;
    // vital signs
    // orders: assessmentorders, ....

    public Encounter(Patient p, String cc, Event ev) { // event is the date when the check was made
        chiefComplaint = cc;
        event = ev;
        patient = p;
    }

    public void newDiagnosis(String diseasetype, boolean confirmed) {

        diagnosis = new Diagnosis(diseasetype, confirmed);

    }

    public Diagnosis getDiagnosis() {

        return diagnosis;

    }

}