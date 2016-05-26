package com.bootcampprojv1.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDetailsDAOJDBCImpl implements LoginDetailsDAO {
	private NamedParameterJdbcTemplate jdbc;

	@Override
	public LoginDetails authenticateLogin(String id, String password) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("LoginId", id);
		parameters.addValue("Password", password);
		return jdbc.queryForObject("select * from LoginDetails where LoginId = :LoginId and Password = :Password", parameters,
				loginDetailsMapper);

	}

	private final RowMapper<LoginDetails> loginDetailsMapper = new RowMapper<LoginDetails>() {
		@Override
		public LoginDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			LoginDetails loginDetails = new LoginDetails();
			loginDetails.setLoginId(rs.getString("LoginId"));
			loginDetails.setPassword(rs.getString("Password"));

			return loginDetails;
		}
	};
}
