package kg.neobis.part3.service.impl;

import kg.neobis.part3.mapper.ProductMapper;
import kg.neobis.part3.model.Product;
import kg.neobis.part3.model.dto.ProductDTO;
import kg.neobis.part3.repository.ProductRepo;
import kg.neobis.part3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;
    private final ProductRepo productRepo;

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        Product product = productMapper.toEntity(productDTO);
        Product save = productRepo.save(product);
        return productMapper.toDto(save);
    }

    @Override
    public ProductDTO findById(Long id) {
        return null;
    }

    @Override
    public List<ProductDTO> findAll() {
        return null;
    }

    @Override
    public ProductDTO update(ProductDTO productDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }


}
