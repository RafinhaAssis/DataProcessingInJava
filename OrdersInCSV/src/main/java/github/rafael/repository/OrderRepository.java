package github.rafael.repository;

import github.rafael.models.OrderClassModel;
import github.rafael.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicBoolean;

@Repository
public class OrderRepository {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void saveOrder(OrderClassModel orderClassModel){
            jdbcTemplate.update("""
                insert into T_TT_ORDERS (id, NR_ORDER, ID_USER,DT_ORDER,ST_ORDER, VL_TOTAL ) values (?,?,?,?,?,?);
                """,
                    orderClassModel.getId(),
                    Integer.parseInt(orderClassModel.getNrOrder()),
                    orderClassModel.getIdUser(),
                    orderClassModel.getDtOrder()==null? null: LocalDate.parse(orderClassModel.getDtOrder()),
                    orderClassModel.getStOrder(),
                    new BigDecimal(orderClassModel.getVlTotal())
                    );


    }

    public boolean findByNrOrder(int nrOrder) {
        AtomicBoolean status = new AtomicBoolean(false);
        jdbcTemplate.query("""
            SELECT * FROM T_TT_ORDERS WHERE nr_order = ? LIMIT 1;
            """, (rs, rowNum)->{
            status.set(true);
            return null;
        }, nrOrder);
        return status.get();
    }
}
