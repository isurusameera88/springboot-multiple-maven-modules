package rc.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rc.model.Hotel;

import java.util.ArrayList;
import java.util.List;
@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel tulip = new Hotel("tulip");
        Hotel rose = new Hotel("rose");
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(tulip);
        hotelList.add(rose);
        this.hotelRepository.saveAll(hotelList);

    }
}
