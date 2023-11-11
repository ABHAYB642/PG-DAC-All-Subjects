package com.demo.dao;

import java.util.List;

import com.demo.beans.Player;
import com.demo.beans.Team;

public interface TeamDao {

	void save(Team t);

	boolean deleteTeamId(int id);

	boolean deletePlayerbyid(int id);

	List<Team> getall();


}
