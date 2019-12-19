package exam.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface C extends JpaRepository<Account, Integer> {
	
	//Mobile is entity class, Integer is primary key
	// hibernate will never work until you use concept called Primary key.
	
	//@Query("SELECT u FROM Mobile u WHERE u.imeino = 3")
	//Collection<Mobile> findAllActiveUsers();
}
