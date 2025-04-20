package github.rafael.repository;

import github.rafael.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
public class UserRepository {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void saveUser(UserModel userModel){
        jdbcTemplate.update("""
                insert into T_TT_USERS (id, NM_USER, DS_EMAIL) values (?,?,?);
                """, userModel.getId(), userModel.getNmUser(), userModel.getDsEmail());

    }

    @Transactional
    public UserModel searchValue(UserModel userModel){
        return  jdbcTemplate.query("""
                SELECT * FROM T_TT_USERS WHERE NM_USER = ? AND DS_EMAIL = ? LIMIT 1;
                """, (rs, rowNum)->new UserModel(UUID.fromString(rs.getString("id")), rs.getString("nm_user"), rs.getString("ds_email"))
        , userModel.getNmUser(), userModel.getDsEmail()).get(0);
    }
}
