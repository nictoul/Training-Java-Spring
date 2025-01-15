package training.java.Mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowMapperUsage {
    private static final Logger logger = LoggerFactory.getLogger(ShowMapperUsage.class);
    @Autowired
    SimpleMapper mapper;

    public void showMappingUsage(){
        var simpleDto = new SimpleDto();
        simpleDto.id = 1234L;
        simpleDto.name = "SimpleDtoName";

        var simpleEntity = new SimpleEntity();
        simpleEntity.id = 4567L;
        simpleEntity.name = "SimpleEntityName";

        SimpleDto dto = mapper.entityToDto(simpleEntity);
        SimpleEntity entity = mapper.dtoToEntity(simpleDto);

        logger.info(dto.toString());
        logger.info(entity.toString());
    }
}
