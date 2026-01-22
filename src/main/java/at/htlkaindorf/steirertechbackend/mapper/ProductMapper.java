package at.htlkaindorf.steirertechbackend.mapper;


import at.htlkaindorf.steirertechbackend.dto.ProductDto;
import at.htlkaindorf.steirertechbackend.pojos.Product;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * MapStruct mapper for converting between Product entity and ProductDto.
 *
 * Note: If your project uses different package names (e.g. entity/response/request DTOs),
 * adjust the imports + method signatures accordingly.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto toDto(Product product);

    List<ProductDto> toDtoList(List<Product> products);

    Product toEntity(ProductDto dto);

    List<Product> toEntityList(List<ProductDto> dtos);

}
