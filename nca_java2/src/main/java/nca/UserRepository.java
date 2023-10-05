package nca;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String>{

	List<UserEntity> findByKanaContainingAndBloodtypeLikeAndAddressStartingWith(String kana, String bloodtype,
			String address);
}
