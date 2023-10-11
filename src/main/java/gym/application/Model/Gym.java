package gym.application.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private  String Name;
  private LocalDate date;
  private Long height;
  private  Long weight;
  private  Long price;
  private  String system_eat;

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", date=" + date +
                ", height=" + height +
                ", weight=" + weight +
                ", price=" + price +
                ", system_eat='" + system_eat + '\'' +
                '}';
    }
}
