package ca.onepoint.yul.service;

import ca.onepoint.yul.dto.MapDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.configurationprocessor.json.JSONException;

import java.util.List;

public interface IMapService {

    MapDto getMapById(Long id) throws JSONException, JsonProcessingException;

    List<MapDto> getAllMap() throws JSONException, JsonProcessingException;

}
