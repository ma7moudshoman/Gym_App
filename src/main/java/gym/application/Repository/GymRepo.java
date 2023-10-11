package gym.application.Repository;

import gym.application.Model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepo extends JpaRepository<Gym,Long>  {

}
