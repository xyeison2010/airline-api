package com.bsale.airline.model;


import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="purchase_id")
	private Long id;
	
	@Column(name = "purchase_date")
	private int purchaseDate;
	
	@OneToMany(mappedBy = "purchase") 
	private List<BoardingPass> boardingPass;


	
	public Purchase(Long id, int purchaseDate, List<BoardingPass> boardingPass) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.boardingPass = boardingPass;
	}

	public Purchase() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(int purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public List<BoardingPass> getBoardingPass() {
		return boardingPass;
	}

	public void setBoardingPass(List<BoardingPass> boardingPass) {
		this.boardingPass = boardingPass;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", purchaseDate=" + purchaseDate + ", boardingPass=" + boardingPass + "]";
	}

	
	
	
	
}
