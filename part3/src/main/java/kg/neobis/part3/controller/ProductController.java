package kg.neobis.part3.controller;

import kg.neobis.part3.model.dto.ProductDTO;
import kg.neobis.part3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/save")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO){
        return productService.saveProduct(productDTO);
    }
}
