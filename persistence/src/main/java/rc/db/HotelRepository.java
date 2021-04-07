package rc.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
