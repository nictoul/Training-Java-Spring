package training.java.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SimpleMapper {
    SimpleMapper INSTANCE = Mappers.getMapper(SimpleMapper.class);

    SimpleEntity dtoToEntity(SimpleDto dto);
    SimpleDto entityToDto(SimpleEntity user);
}
