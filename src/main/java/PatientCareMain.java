
import com.github.javafaker.Faker;

import PatientManagement.Catalogs.AgeGroup;
import PatientManagement.Catalogs.VitalSignLimits;
import PatientManagement.Catalogs.VitalSignsCatalog;
import PatientManagement.Clinic.Clinic;
import PatientManagement.Clinic.Event;
import PatientManagement.Clinic.EventSchedule;
import PatientManagement.Clinic.Location;
import PatientManagement.Clinic.LocationList;
import PatientManagement.Clinic.PatientDirectory;
import PatientManagement.Clinic.Site;
import PatientManagement.Clinic.SiteCatalog;
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
        
        PersonDirectory pD = new PersonDirectory();
        PersonDirectory pDAll = pD.generatePersonInstance();
        // for (Person p : pD1.getPersonDirectory()){
        //     System.out.println(p.getPersonId() + p.getPersonLocation());
        // } 
        System.out.println(pDAll.getPersonDirectory().size());













        // configure a clinic
//         Clinic clinic = new Clinic("Northeastern Hospitals");

//         // Configuring vital signs catalog !we need a function
//         VitalSignsCatalog vsc = clinic.getVitalSignsCatalog();

//         AgeGroup adults_21_50 = vsc.newAgeGroup("Adults 21-50", 50, 21);
//         VitalSignLimits heartRateLimits = vsc.newVitalSignLimits("HR");
//         VitalSignLimits bloodPressureLimits = vsc.newVitalSignLimits("BP");
//         heartRateLimits.addLimits(adults_21_50, 105, 55);
//         bloodPressureLimits.addLimits(adults_21_50, 140, 70);

//         // Adding a person we need function
//         PersonDirectory pd = clinic.getPersonDirectory();
//         // Person archilPerson = pd.newPerson("archil", 49);


//         // Creating a patient
//         PatientDirectory patientDirectory = clinic.getPatientDirectory();
//         Patient archil = patientDirectory.newPatient(archilPerson);

//         // Create a location - Greater Boston Area, MA

//         LocationList locationsInMA = clinic.getLocationList();
//         Location greaterBostonArea = locationsInMA.newLocation("Greater Boston Area");

//         SiteCatalog siteCatalog = clinic.getSiteCatalog();
//         Site nuCurryCenter = siteCatalog.newSite(greaterBostonArea);
//         Site nuHealthServices = siteCatalog.newSite(greaterBostonArea);

//         EventSchedule eventSchedule = new EventSchedule();

//         Event patriotsWeekendPatientScreening = eventSchedule.newEvent(nuHealthServices, "0");

//         Encounter archilsVisitToDoctor = archil.newEncounter("Seasonal Flu", patriotsWeekendPatientScreening);
//         archilsVisitToDoctor.addNewVitals("HR", 90);
//         archilsVisitToDoctor.addNewVitals("BP", 100);

//         // System.out.println("Does the patient feel well? " +
//         // archilsVisitToDoctor.areVitalsNormal());

//         // Java Faker Sandbox

//         Faker magicBox = new Faker();

//         for (int i = 0; i < 20; i++) {
//             // String randomBloodGroup = magicBox.name().bloodGroup();
//             // System.out.println(randomBloodGroup);

//             String randomAddress = magicBox.address().fullAddress();
//             System.out.println(randomAddress);

//             // String randomAnimal = magicBox.animal().name();
//             // System.out.println(randomAnimal);
//         }

     }

 }
