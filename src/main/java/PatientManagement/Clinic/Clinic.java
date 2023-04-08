/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagement.Clinic;

import PatientManagement.Catalogs.DrugCatalog;
import PatientManagement.Persona.PersonDirectory;

/**
 *
 * @author kal bugrara
 */
public class Clinic {
    PatientDirectory patientdirectory;
    PersonDirectory persondirectory;
    SiteCatalog sitelist;
    LocationList locationlist;
    DrugCatalog drugcatalog;
    EventSchedule eventschedule;
    String name; // name of the clinic

    public Clinic(String n) {
        eventschedule = new EventSchedule();
        sitelist = new SiteCatalog();
        persondirectory = new PersonDirectory();
        patientdirectory = new PatientDirectory();

        name = n;
    }

    public SiteCatalog getSiteCatalog() {
        return sitelist;
    }

    public LocationList getLocationList() {
        return locationlist;
    }

    public Site newSite(Location location) {

        Site s = sitelist.newSite(location);
        return s;
    }

}
