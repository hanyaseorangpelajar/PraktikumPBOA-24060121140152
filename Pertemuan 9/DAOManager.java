/**
 * Nama: Adri Audifirst
 * Tanggal: 4 Juni 2023
 * File DAOManager.java
 * Deskripsi: pengelola DAO dalam program
*/
public class DAOManager{
    private PersonDAO personDAO;
    public void setPersonDAO (PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO () {
        return personDAO;
    }
}