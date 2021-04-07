package rc.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rc.db.HotelRepository;
import rc.model.Hotel;

import java.util.List;

@RestController
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    @GetMapping("/hotels")
    public List<Hotel> get(){
        return hotelRepository.findAll();
    }
}
