package com.demo.service;

import java.util.List;

import com.demo.beans.Team;

public interface TeamService {

	void addTeam();

	boolean deleteTeambyid(int id);

	boolean deletePlayerbyid(int id);

	List<Team> displayAll();

}
