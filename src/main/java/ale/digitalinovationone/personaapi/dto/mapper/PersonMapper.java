package ale.digitalinovationone.personaapi.dto.mapper;

import ale.digitalinovationone.personaapi.dto.request.PersonDTO;
import ale.digitalinovationone.personaapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
