package ca.onepoint.yul.repository.custom.impl;

import ca.onepoint.yul.entity.Map;
import ca.onepoint.yul.repository.custom.MapRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class MapRepositoryImpl implements MapRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Map findByIdMap(Long id) {
        // Construction de la requête
        StringBuilder queryBuilder = new StringBuilder();
        // Clause SELECT
        queryBuilder.append("SELECT a.id, a.name, a.map ");
        // Clause FROM
        queryBuilder.append("FROM Map a ");
        // Clause WHERE
        queryBuilder.append("WHERE a.id = '" + id + "' ");

        Query query = entityManager.createQuery(queryBuilder.toString());
        return ObjetToMap((Object[]) query.getSingleResult());
    }

    @Override
    public List<Map> findAllMap() {
        // Construction de la requête
        StringBuilder queryBuilder = new StringBuilder();
        // Clause SELECT
        queryBuilder.append("SELECT a.id, a.name, a.map ");
        // Clause FROM
        queryBuilder.append("FROM Map a ");

        Query query = entityManager.createQuery(queryBuilder.toString());
        List<Object[]> objectList = ((List<Object[]>) query.getResultList());
        List<Map> mapList = new ArrayList<>();
        for (Object[] objet:objectList) {
            mapList.add(ObjetToMap(objet));
        }
        return mapList;
    }

    private Map ObjetToMap(Object[] result) {
        Map map = new Map();
        map.setId((Integer) result[0]);
        map.setName((String) result[1]);
        map.setMap((String) result[2]);
        return map;
    }


}
