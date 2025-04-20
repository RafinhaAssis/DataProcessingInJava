package github.rafael.repository;

import github.rafael.models.ProductModel;
import github.rafael.models.UserModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

@Repository
public class ProductRepository {
    JdbcTemplate jdbcTemplate;


    public ProductRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public boolean finbByName(ProductModel productModel){
        AtomicBoolean status = new AtomicBoolean(false);
        jdbcTemplate.query("""
            SELECT * FROM T_TT_PRODUCTS WHERE NM_PRODUCT = ? AND DS_CATEGORY = ? LIMIT 1
            """, (rs, rowNum)->{
            status.set(true);
            return null;
        }, productModel.getNmProduct(), productModel.getDsCategory());
        return status.get();
    }

    public ProductModel search(ProductModel productModel){
        return  jdbcTemplate.query("""
                SELECT * FROM T_TT_PRODUCTS WHERE NM_PRODUCT = ? AND DS_CATEGORY = ? LIMIT 1;
                """, (rs, rowNum)->new ProductModel(
                        UUID.fromString(rs.getString("id")),
                        rs.getString("nm_product"),
                        rs.getString("ds_category"),
                        rs.getString("vl_price"))
                , productModel.getNmProduct(), productModel.getDsCategory()).get(0);
    }


    @Transactional
    public void save(ProductModel productModel) {
        jdbcTemplate.update("""
            insert into T_TT_PRODUCTS values (?,?,?, cast(? as numeric));
            """,
                productModel.getId(),
                productModel.getNmProduct(),
                productModel.getDsCategory(),
                productModel.getVlPrice());


    }
}
