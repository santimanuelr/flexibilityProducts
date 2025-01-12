package ar.com.plug.examen.repository;

import ar.com.plug.examen.domain.model.OrderShopping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderShopping, Long> {
}
