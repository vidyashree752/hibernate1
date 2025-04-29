package learn.hiber;

import jakarta.persistence.*;

@Entity
public class person {
	
	@Id
	int id;
	String nickname;
	@OneToOne
	AadharCard card;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int id, String nickname, AadharCard card) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.card = card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public AadharCard getCard() {
		return card;
	}
	public void setCard(AadharCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", nickname=" + nickname + ", card=" + card + "]";
	}
}
