package ca.onepoint.yul.repository.custom;

import ca.onepoint.yul.entity.Map;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapRepositoryCustom {

    Map findByIdMap(Long id);
    List<Map> findAllMap();
}
