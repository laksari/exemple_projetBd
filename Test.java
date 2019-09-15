import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TEST {


	public static void main(String[] args) throws Exception  {

          // Ajouter un patient 
	  DB db = new DB();
          db.insertPatientV1(7,"toto","titi");

	  //Ajouter un 2 eme patient
	  db.insertPatientV3(105,"toto11","titi");


	}  





}
