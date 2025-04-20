package github.rafael.repository;

import github.rafael.models.ItensProductsModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ItensRepository {

    JdbcTemplate jdbcTemplate;

    public ItensRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveItem(ItensProductsModel itensProductsModel){
        jdbcTemplate.update("""
                insert into T_TT_ITENS_ORDERS (ID, ID_ORDER, ID_PRODUCT,QT_ITEN,VL_TOTAL) values (?,?,?,?,?);
                """,
                itensProductsModel.getId(),
                itensProductsModel.getIdOrder(),
                itensProductsModel.getIdProduct(),
                itensProductsModel.getQtIten(),
                itensProductsModel.getVlTotal()

        );

    }
}
