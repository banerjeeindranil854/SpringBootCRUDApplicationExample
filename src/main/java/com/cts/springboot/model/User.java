package com.cts.springboot.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="APP_USER")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name="NAME", nullable=false)
	private String name;

	@Column(name="AGE", nullable=false)
	private Integer age;

	@Column(name="FOOD_PRE", nullable=false)
	private String foodPre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFoodPre() {
		return foodPre;
	}

	public void setFoodPre(String foodPre) {
		this.foodPre = foodPre;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (foodPre != null ? !foodPre.equals(user.foodPre) : user.foodPre != null) return false;
		if (id != null ? !id.equals(user.id) : user.id != null) return false;
		if (name != null ? !name.equals(user.name) : user.name != null) return false;
		return age != null ? age.equals(user.age) : user.age == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (age != null ? age.hashCode() : 0);
		result = 31 * result + (foodPre != null ? foodPre.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", foodPre=" + foodPre + "]";
	}


}
