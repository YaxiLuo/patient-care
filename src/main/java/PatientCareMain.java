
import com.github.javafaker.Faker;

import PatientManagement.Catalogs.AgeGroup;
import PatientManagement.Catalogs.VitalSignLimits;
import PatientManagement.Catalogs.VitalSignsCatalog;
import PatientManagement.Clinic.Clinic;
import PatientManagement.Clinic.PatientDirectory;
import PatientManagement.Patient.Patient;
import PatientManagement.Patient.Encounters.Encounter;
import PatientManagement.Patient.Encounters.VitalSignMetric;
import PatientManagement.Persona.Person;
import PatientManagement.Persona.PersonDirectory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kal bugrara
 */

public class PatientCareMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Clinic clinic = new Clinic("Northeastern Hospitals");

        // Configuring vital signs catalog
        VitalSignsCatalog vsc = clinic.getVitalSignsCatalog();

        AgeGroup adults_21_50 = vsc.newAgeGroup("Adults 21-50", 50, 21);
        VitalSignLimits heartRateLimits = vsc.newVitalSignLimits("HR");
        VitalSignLimits bloodPressureLimits = vsc.newVitalSignLimits("BP");
        heartRateLimits.addLimits(adults_21_50, 105, 55);
        bloodPressureLimits.addLimits(adults_21_50, 140, 70);

        // Adding a person
        PersonDirectory pd = clinic.getPersonDirectory();
        Person archilPerson = pd.newPerson("archil", 49);

        // Creating a patient
        PatientDirectory patientDirectory = clinic.getPatientDirectory();
        Patient archil = patientDirectory.newPatient(archilPerson);

        Encounter archilsVisitToDoctor = archil.newEncounter("Seasonal Flu", null);
        archilsVisitToDoctor.addNewVitals("HR", 90);
        archilsVisitToDoctor.addNewVitals("BP", 100);

        System.out.println("Does the patient feel well? " + archilsVisitToDoctor.areVitalsNormal());

    }

}
