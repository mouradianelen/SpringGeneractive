package am.aca.generactive.generactive.repository;

import am.aca.generactive.generactive.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>,
        JpaSpecificationExecutor<Item> {

    List<String> getAllNames();

    List<Item> findAll(Long lim, Long off);
}
