package com.careerit.cj.collections.ipl;

public class Team {

	private String city;
	private String label;
	private String coach;
	private String name;
	private String homeGround;

	private Team(TeamBuilder teamBuilder) {
		this.name = teamBuilder.name;
		this.city = teamBuilder.city;
		this.coach = teamBuilder.coach;
		this.homeGround = teamBuilder.homeGround;
		this.label = teamBuilder.label;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeGround() {
		return homeGround;
	}

	public void setHomeGround(String homeGround) {
		this.homeGround = homeGround;
	}

	public static TeamBuilder builder() {
		return new TeamBuilder();
	}

	public static class TeamBuilder {
		private String city;
		private String label;
		private String coach;
		private String name;
		private String homeGround;

		public TeamBuilder city(String city) {
			this.city = city;
			return this;
		}

		public TeamBuilder label(String label) {
			this.label = label;
			return this;
		}

		public TeamBuilder coach(String coach) {
			this.coach = coach;
			return this;
		}

		public TeamBuilder homeGround(String homeGround) {
			this.homeGround = homeGround;
			return this;
		}

		public TeamBuilder name(String name) {
			this.name = name;
			return this;
		}

		public Team build() {
			return new Team(this);
		}
	}

}
