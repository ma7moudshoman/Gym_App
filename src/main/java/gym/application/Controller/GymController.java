package gym.application.Controller;

import gym.application.Model.Gym;
import gym.application.Service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class GymController {

    @Autowired
    private GymService gymService;

    @Autowired
    public GymController (GymService gymService){
        this.gymService=gymService;
    }
    @GetMapping("/AllCustomer")
    public List<Gym> Customers(){
        return gymService.GetAll();
    }

@GetMapping("/GetCustomer")
public Optional<Gym> findById(@PathVariable long id){
        return gymService.getCustomerById(id);
}
@PostMapping("AddCustomer")
    public Gym addCustomer(@RequestBody Gym gym){
        return gymService.addCustomer(gym);
    }
    @PutMapping("/update{id}")
    public  Gym UpdateCustomer(@RequestBody Gym gym,@PathVariable long id){
        gym.setId(id);
        return gymService.Update(gym);
    }

    @PutMapping("/delete/{id}")
    private ResponseEntity<HashMap<String,String>> DeleteById(@PathVariable long id){
        if (gymService.exsistById(id)) {
            gymService.removeCustomer(id);

            HashMap<String, String> message = new HashMap<>();
            message.put("message", id + "customer delete successfully");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);}

        else {

            HashMap<String,String> message = new HashMap<>();
            message.put("message", "customer id" + " " + id + " " + "not found or match ");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }



        }


}
