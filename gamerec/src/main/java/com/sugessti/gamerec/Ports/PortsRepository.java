package com.sugessti.gamerec.Ports;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository


public interface PortsRepository extends JpaRepository<Ports, UUID>{
   public static final JdbcTemplate jdbcTemplate = new JdbcTemplate();

    final RowMapper<Ports> portsRowMapper = new RowMapper<Ports>() {
        @Override
        public Ports mapRow(ResultSet rs, int rowNum) throws SQLException {

            Ports port = new Ports();
            port.setPortsID(UUID.fromString(rs.getObject("portsID", UUID.class).toString()));
            port.setPlatform(rs.getString("platforms"));
            port.setCompatibility(rs.getString(" compatability"));


            return port;
        }
    };


    public default ArrayList<Ports> findAll() {
        String sql = "SELECT * FROM ports";
        return (ArrayList<Ports>) jdbcTemplate.query(sql, portsRowMapper);
    }



    public default Optional<Ports> findById( UUID id) {
        String sql = "SELECT * FROM ports WHERE portsID = ?";
        @SuppressWarnings("deprecation")
        Ports port = jdbcTemplate.queryForObject(sql, new Object[]{id}, portsRowMapper);
        return Optional.ofNullable(port);
    }

    
public default <S> Ports save(Ports port) {
    String sql = "INSERT INTO ports (portsID, platforms, compatability) VALUES (?, ?, ?)";
    jdbcTemplate.update(sql, port.getPortsID(), port.getPlatform(), port.getCompatibility());
    return port;
}




    public default void update(Ports port) {
        jdbcTemplate.update("UPDATE vehicles SET platforms = ?, compatability = ?",
        port.getPlatform(), port.getCompatibility());
    }

    public default void delete(UUID id) {
        jdbcTemplate.update("DELETE FROM ports WHERE port_id = ?", id);
    }
}

