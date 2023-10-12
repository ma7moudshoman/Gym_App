package gym.application.Service;

import gym.application.Model.Gym;
import gym.application.Repository.GymRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymService {
    @Autowired
    private GymRepo gymRepo;

    public List<Gym>GetAll(){
        return gymRepo.findAll();
    }
    public Optional<Gym> getCustomerById(long id){
        return gymRepo.findById(id);
    }

    public Boolean exsistById(long id){
        return gymRepo.existsById(id);
    }
    public Gym addCustomer(Gym gym){
        return gymRepo.save(gym);
    }
    public Gym Update(Gym gym){
        return gymRepo.save(gym);
    }
    public void removeCustomer(long id){
        gymRepo.deleteById(id);
    }


}

