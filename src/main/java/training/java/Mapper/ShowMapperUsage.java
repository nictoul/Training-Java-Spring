package training.java.Mapper;

import org.springframework.stereotype.Service;

@Service
public class ShowMapperUsage {

    public void showMappingUsage(){
        var simpleDto = new SimpleDto();
        simpleDto.id = 1234L;
        simpleDto.name = "SimpleDtoName";

        var simpleEntity = new SimpleEntity();
        simpleEntity.id = 4567L;
        simpleEntity.name = "SimpleEntityName";

        SimpleDto dto = SimpleMapper.INSTANCE.entityToDto(simpleEntity);
        SimpleEntity user = SimpleMapper.INSTANCE.dtoToEntity(simpleDto);
    }
}
