package myeverydaypartner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myeverydaypartner.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	public UserEntity findByEmail(String email);
}
