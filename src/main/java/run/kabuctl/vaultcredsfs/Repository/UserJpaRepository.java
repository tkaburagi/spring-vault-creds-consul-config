package run.kabuctl.vaultcredsfs.Repository;

import run.kabuctl.vaultcredsfs.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<User, String> {
}