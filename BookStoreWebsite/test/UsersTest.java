import com.bookstore.entity.Users;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UsersTest {

	public static void main(String[] args) {
		
		Users usrObj = new Users();
		usrObj.setEmail("jacky.jock@gmail.com");
		usrObj.setFullName("jacky jock");
		usrObj.setPassword("jacky");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//begin transaction
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(usrObj);
		
		//commit the transaction
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		entityManagerFactory.close();
		
		System.out.println("an usr obj was persisted");

	}

}
