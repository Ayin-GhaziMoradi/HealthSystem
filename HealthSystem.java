import java.util.Collection;

public class HealthSystem {
    Collection<Patient> patients;
    Collection<Doctor> doctors;

    /**
     * adds a doctor to the list
     * @param doctor the doctor to be added
     * @param access access type
     */
    public void addDoctor(Doctor doctor , int access){

    }

    /**
     * adds a patient to the list
     * @param patient the patient to be added
     */
    public void addPatient(Patient patient){

    }

    /**
     * the patient chooses their first doctor
     * @param doctor the chosen doctor
     * @param patient the patient to get their first doctor
     */
    public void addDocByPatient(Doctor doctor , Patient patient){

    }

    /**
     * current doctor refers the patient to a new doctor
     * @param currDoctor current doctor
     * @param referDoctor refered doctor
     * @param patient patient who is getting a new doctor
     */
    public void referDoctor(Doctor currDoctor , Doctor referDoctor , Patient patient){

    }

    /**
     * a doctor requests a patient's data
     * @param doctor the requesting doctor
     * @param patient the requested patient
     */
    public void reqByDoctor(Doctor doctor , Patient patient){

    }

    /**
     * a patient requests their own data
     * @param patient the requesting patient
     */
    public void reqByPatient(Patient patient){

    }

    /**
     * a patient requests their own data to show a pharmacist
     * @param patient the requesting patient
     */
    public void reqForPharmacy(Patient patient){

    }

    /**
     * a doctor wants to change their patients' info
     * @param doctor acting doctor
     * @param patient patient to be updated
     * @param updatedPatient the updated version
     */
    public void update(Doctor doctor , Patient patient , Patient updatedPatient){

    }
}
